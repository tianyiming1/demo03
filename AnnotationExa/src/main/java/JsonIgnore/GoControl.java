package JsonIgnore;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;


import java.io.IOException;

public class GoControl {

//    @JsonIgnore
//    @JsonProperty


    public static JSONObject printParam(){
        WiBean bean = new WiBean();
        bean.setNames("key");
        bean.setValues("value");

        return JSONObject.fromObject(bean);
    }

    public static void main(String[] args) {
        WiBean bean = new WiBean();
        bean.setNames("tan");
        bean.setValues("dalei");
        try {
            System.out.println(new ObjectMapper().writeValueAsString(bean));
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}