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
        
        // solicita ao usu�rio um nome de usu�rio e senha
        System.out.print("Digite seu nome de usu�rio: ");
        username = input.nextLine();
        System.out.print("Digite sua senha: ");
        password = input.nextLine();
        
        // verifica se o nome de usu�rio e senha s�o v�lidos
        if (username.equals("usuario") && password.equals("senha")) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Nome de usu�rio ou senha incorretos.");
        }
    }
}
</body>
</html>