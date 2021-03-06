package discord4j.discordjson.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUserGuildData.class)
@JsonDeserialize(as = ImmutableUserGuildData.class)
public interface UserGuildData extends GuildFields {

    static ImmutableUserGuildData.Builder builder() {
        return ImmutableUserGuildData.builder();
    }
}
