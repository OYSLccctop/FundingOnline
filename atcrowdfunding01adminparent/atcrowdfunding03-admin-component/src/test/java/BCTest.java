import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCTest {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("123123"));
    }
}
