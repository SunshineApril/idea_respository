public class HelloController {
    public static void main(String[] args) {
        HelloService helloService = new HelloService();
        String name = helloService.saytoSOme("name");
        System.out.println(name);
    }
}
