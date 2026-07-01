public class Login {
 private final String username;
 private final String password;

    public Login(String username, String password) {
    this.username = username;
    this.password = password;
    }

    public boolean autenticar() {
        // Simulação de autenticação 
        return "admin".equals(username) && "1234".equals(password);
    }

}