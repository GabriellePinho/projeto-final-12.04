<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password;
        
        // solicita ao usuário um nome de usuário e senha
        System.out.print("Digite seu nome de usuário: ");
        username = input.nextLine();
        System.out.print("Digite sua senha: ");
        password = input.nextLine();
        
        // verifica se o nome de usuário e senha são válidos
        if (username.equals("usuario") && password.equals("senha")) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos.");
        }
    }
}
</body>
</html>