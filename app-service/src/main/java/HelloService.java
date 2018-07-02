public class HelloService {
    public String saytoSOme(String name){
        HelloDao helloDao = new HelloDao();
        return helloDao.sayhai(name);
    }
}
