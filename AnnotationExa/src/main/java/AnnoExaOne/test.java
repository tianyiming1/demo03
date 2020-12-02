package AnnoExaOne;

import java.lang.annotation.Target;
import java.lang.reflect.Method;

@MyTarget(name = "ww",age = 22)
public class test {
    @MyTarget( name = "tym", age = 17)
    public void  makePerson(){
        
    }

    @MyTarget( name = "tym22", age = 15)
    public void  makePerson2(){

    }

    public static void main(String[] args) {
        try {
            //参数为特定方法名  ，通过反射获取  解析方法
            Method method = test.class.getMethod("makePerson",null);
            //判断是否是这个注解类型
            if(method.isAnnotationPresent(MyTarget.class)){
                //通过方法获得注解的对象
                MyTarget target = method.getAnnotation(MyTarget.class);
                System.out.println(target.name()+" "+target.age());
                System.out.println(method.getAnnotation(MyTarget.class));
        
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


        Class<test> testClass = test.class;
//        Method[] methods =  testClass.getMethods();
//        for(Method method:methods){
//           
//            if(method.isAnnotationPresent(MyTarget.class)){
//                MyTarget myTarget = method.getAnnotation(MyTarget.class);
//                System.out.println(myTarget.name()+"  "+myTarget.age());
//            }
//        }

        
        //解析类
        if(testClass.isAnnotationPresent(MyTarget.class)){
            MyTarget myTarget = testClass.getAnnotation(MyTarget.class);
            System.out.println(myTarget.age()+" "+myTarget.name());
        }

    }
}
