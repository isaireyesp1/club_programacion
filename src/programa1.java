
import javax.swing.JOptionPane;


public class programa1 {
    public static void main(String args[]){
        int n;
        do{
        String menu=JOptionPane.showInputDialog("MENU DE OPCIONES\n"+"1.- Consepto de clases\n"+"2.- Consepto de objetos\n"+"3.- Consepto de atributos\n"+"4.- Consepto de Metodos\n"+"5.- Salir\n");
        n = Integer.parseInt(menu);
        switch(n){
            case 1:   JOptionPane.showMessageDialog(null, "Una clase en Java se puede entender como un prototipo que define las variables\n y los métodos comunes a un cierto tipo de instancias, una clase define todo\n lo que caracteriza y pueden hacer una o varias instancias.");
            break;
            case 2:   JOptionPane.showMessageDialog(null, "Como ves, un objeto en Java es la unidad básica de este lenguaje de programación\n y representa las entidades de la vida real. Un programa típico de Java crea\n muchos objetos que interactúan al invocar métodos. De esta forma, podemos \ndecir que un objeto consiste en: Estado: está representado por atributos de un \nobjeto.");
            break;
            case 3:   JOptionPane.showMessageDialog(null, "Los atributos, también llamados datos o variables miembro son porciones de \ninformación que un objeto posee o conoce de sí mismo. Una clase puede tener cualquier\n número de atributos o no tener ninguno. Se declaran con un identificador\n y el tipo de dato correspondiente.");
            break;
            case 4:   JOptionPane.showMessageDialog(null, "Los métodos son subrutinas que manipulan los datos definidos por la clase y, \nen muchos casos, brindan acceso a esos datos. En la mayoría de los casos, otras \npartes de tu programa interactuarán con una clase a través de sus métodos. Un \nmétodo contiene una o más declaraciones.");
            break;
            case 5:   JOptionPane.showMessageDialog(null, "Saliendo");
            break;
            default:  JOptionPane.showMessageDialog(null, "Esta Opcion no es valida");    
    }
        }while(n!=5);
    }
}
