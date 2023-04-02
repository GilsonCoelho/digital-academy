package br.com.gsc.digitalacademy.infra.jackson.deser;

import br.com.gsc.digitalacademy.infra.utils.JavaTimeUtils;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;

/**
 * @author Venilton Falvo Jr
 */
public class LocalDateTimeDeserializer extends StdDeserializer<LocalDateTime> {

    public LocalDateTimeDeserializer() {
        super(LocalDateTime.class);
    }

    @Override
    public LocalDateTime deserialize(final JsonParser parser, final DeserializationContext context) throws IOException {
        return LocalDateTime.parse(parser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_TIME_FORMATTER);
    }
}
