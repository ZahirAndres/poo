package mx.utng.s24.dp.factory;
import javax.swing.JButton;
/**
 * @autor Zahir Andres Rodriguez Mora
 * @category GDS0622
 * @size 06/03/2024
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Declaro una clase que crea JFrame(Ventana básica)
public class Cliente extends JFrame{

    //Declaro dos elementos de formularios
    private JTextField txtUsuario;
    private JPasswordField txtPassworld;
    
    //Creando los elementos de inicio de la ventana
    public Cliente(){
        //mandando llamar al contructor de la superclase (JFrame) 
        //colocando un titulo
        super("Login");
        //Pongo una operacion de cierre en el boton x
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //coloco en ancho y alto en pixeles
        setSize(300, 150);

        //Defino un contenedor de elementos visuales
        JPanel panel = new JPanel();
    
        //Al panel le doy uin diseño
        panel.setLayout(new GridLayout(3, 2));

        //Etiqueta para el Usuario
        JLabel lblUsuario = new JLabel("Usuario: ");
        //Etiqueta para el password
        JLabel lblPassword = new JLabel("Password: ");

        //Creamos las cajas de texto
        txtUsuario = new JTextField();
        txtPassworld = new JPasswordField();
        
        //Cramos un boton con titulo Login
        JButton btnLogin = new JButton("Login");
        
        //Colocamos una accion al botn
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                char[] caraPassword = txtPassworld.getPassword();
                String password = new String(caraPassword);

                //System.out.println("Usuario: "+usuario+", Password: "+password);
                if (validarLogin(usuario, password)){
                    JOptionPane.showMessageDialog(Cliente.this, "Login correcto", "Validacion",
                    JOptionPane.INFORMATION_MESSAGE);
                }else{{
                    JOptionPane.showMessageDialog(Cliente.this, "Usuario y/o contraseña incorrecto","Validación",
                    JOptionPane.ERROR_MESSAGE);
                
                }}
            }
        });
        

        //Añadimos los elementos visuales al contenedor
        panel.add(lblUsuario);
        panel.add(txtUsuario);
        panel.add(lblPassword);
        panel.add(txtPassworld);
        panel.add(btnLogin);

        //Agregamos  a la ventana el panel con los elementos visuales
        add(panel);
        //hacemos visible a la ventana
        setVisible(true);
        //Centrar a la ventana
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Cliente();
    }

    private boolean validarLogin(String usuario, String password){
        return usuario.equals("utng") && password.equals("xyz123");
    }

}
