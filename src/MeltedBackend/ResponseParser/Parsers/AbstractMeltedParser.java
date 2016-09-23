package MeltedBackend.ResponseParser.Parsers;

import MeltedBackend.ResponseParser.Responses.GenericResponse;

/**
 * This class is to enforce that each parser has it's own Response object.
 *
 * @author rombus
 */
public abstract class AbstractMeltedParser implements MeltedParser{
    protected static final String OK = "OK";
    protected GenericResponse response;

    public AbstractMeltedParser(GenericResponse response){
        this.response = response;
    }
}
