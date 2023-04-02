package br.com.gsc.digitalacademy.infra.jackson.ser;

import br.com.gsc.digitalacademy.infra.utils.JavaTimeUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDate;

/**
 * @author Venilton Falvo Jr
 */
public class LocalDateSerializer extends StdSerializer<LocalDate> {

    public LocalDateSerializer() {
        super(LocalDate.class);
    }

    @Override
    public void serialize(final LocalDate value, final JsonGenerator generator, final SerializerProvider provider) throws IOException {
        generator.writeString(value.format(JavaTimeUtils.LOCAL_DATE_FORMATTER));
    }
}
