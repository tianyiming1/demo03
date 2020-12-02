package JsonIgnore;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.minidev.json.annotate.JsonIgnore;

public class WiBean {


    // 忽略参数返回
    @JsonIgnore
    protected String names;

//    注解名称：@JsonIgnore
//    作用：在实体类向前台返回数据时用来忽略不想传递给前台的属性或接口。
//    Eg：Bean实体中会有某些运维字段，在返回信息给前台的时候，当不希望将对应值也一并返回；
//    此时可以在对应属性上加上注解JsonIgnore或者，可以在User类上加上注解@JsonIgnoreProperties(value = "{password}")

    // 用于属性上、set/get方法上，该属性序列化后可重命名。
    @JsonProperty(value="val")
    private String values;

    @JsonIgnore
    protected String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @JsonProperty(value="val")
    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }


}