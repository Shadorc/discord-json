package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.Id;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableResolvedMemberData.class)
@JsonDeserialize(as = ImmutableResolvedMemberData.class)
public interface ResolvedMemberData {

    static ImmutableResolvedMemberData.Builder builder() {
        return ImmutableResolvedMemberData.builder();
    }

    Possible<Optional<String>> nick();

    List<Id> roles();

    @JsonProperty("joined_at")
    String joinedAt();

    @JsonProperty("premium_since")
    Possible<Optional<String>> premiumSince();

    Possible<Boolean> pending();

    /** total permissions of the member in the channel, including overrides, returned when in the interaction object. */
    Possible<String> permissions();

}
