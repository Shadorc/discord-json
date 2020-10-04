package discord4j.discordjson.possible;

import org.immutables.encode.Encoding;

import java.util.Objects;

@Encoding
public class IdEncoding {

    @Encoding.Impl(virtual = true)
    private Id id;

    private final long value = id.longValue();

    @Encoding.Expose
    Id get() {
        return discord4j.discordjson.possible.Id.of(value);
    }

    @Override
    public String toString() {
        return Objects.toString(value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public boolean equals(IdEncoding obj) {
        return Objects.equals(value, obj.value);
    }

    @Encoding.Copy
    public Id withId(final Id id) {
        return Objects.requireNonNull(id);
    }

    @Encoding.Copy
    public Id with(final long value) {
        return discord4j.discordjson.possible.Id.of(value);
    }

    @Encoding.Builder
    static class Builder {

        private Id id = null;

        @Encoding.Init
        @Encoding.Copy
        public void set(Id id) {
            this.id = id;
        }

        @Encoding.Init
        public void setValue(long value) {
            this.id = discord4j.discordjson.possible.Id.of(value);
        }

        @Encoding.Build
        Id build() {
            return this.id;
        }
    }
}
