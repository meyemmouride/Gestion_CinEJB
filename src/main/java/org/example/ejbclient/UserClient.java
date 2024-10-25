package org.example.ejbclient;


import org.example.ejbserver.interfaces.UserRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

public class UserClient {
    public static void main(String[] args) {
        try {
            Properties props = new Properties();
            props.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
            props.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");

            Context context = new InitialContext(props);
            UserRemote userBean = (UserRemote) context.lookup("ejb:/cinema-ejb/UserBean!com.example.ejbserver.interfaces.UserRemote");

            System.out.println(userBean.userExists("meryem"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
