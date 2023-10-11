import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
	
	JPanel miPanel;
	JLabel miTitulo, miNombre, miedad,miSalario ,miResultado, miIncremento;
	JButton miBoton , miBotonLimpiar;
	JTextField miCampo, miCampoNombre, miCampo1, miCampoIncremento;

	//Procesos misProcesos=new Procesos();
	public Ventana() {
		iniciarComponentes();
		setTitle("ventana principal");
		setSize(600, 400);
		setLocationRelativeTo(null);
	}
	private void iniciarComponentes() {
		miPanel=new JPanel();
		miPanel.setLayout(null);
		miPanel.setBackground(Color.white);		
		miTitulo=new JLabel();
		miTitulo.setText("Salario ");
		miTitulo.setBounds(200, 10, 300, 30);
		
		miNombre=new JLabel();
		miNombre.setText("Nombre");
		miNombre.setBounds(50, 50, 150, 30);		
		miCampoNombre = new JTextField();
		miCampoNombre.setBounds(100, 50, 150, 30);
		
		
		miSalario=new JLabel();
		miSalario.setText("Salario");
		miSalario.setBounds(300, 100, 150, 30);		
		miCampo1 = new JTextField();
		miCampo1.setBounds(360, 100, 150, 30);
		
		miIncremento=new JLabel();
		miIncremento.setText("Incremento");
		miIncremento.setBounds(60, 100, 70, 30);		
		miCampoIncremento = new JTextField();
		miCampoIncremento.setBounds(130, 100, 150, 30);
		
				
		miResultado=new JLabel();
		miResultado.setText("Resultado: ");
		miResultado.setBounds(60, 150, 500, 30);
		
							
		miBoton=new JButton();
		miBoton.setText("Calcular");
		miBoton.setBounds(70, 200, 150, 30);
		miBoton.addActionListener(this);
		
		
		miBotonLimpiar=new JButton();
		miBotonLimpiar.setText("Limpiar");
		miBotonLimpiar.setBounds(300, 200, 150, 30);
		miBotonLimpiar.addActionListener(this);
		
		
		miPanel.add(miTitulo);
		miPanel.add(miNombre);
		miPanel.add(miCampoNombre);				
		miPanel.add(miIncremento);
		miPanel.add(miCampoIncremento);
		miPanel.add(miSalario);
		miPanel.add(miCampo1);				
		miPanel.add(miResultado);		
		miPanel.add(miBoton);
		miPanel.add(miBotonLimpiar);
		
		
		add(miPanel);
	}
	
	
	public void mostrar() {
		double dato1=Double.parseDouble(miCampo1.getText());
		String dato2=(miCampoIncremento.getText());
		
		if (dato2.equalsIgnoreCase("si")) {
			double aumento=dato1*0.25;
			double resultado=dato1+aumento;
			
			miResultado.setText("Su salario con incremento es de :"+resultado);
		}else {
			miResultado.setText("Usted no obtuvo el incremento");
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==miBoton) {
			mostrar();
		}else if (e.getSource()==miBotonLimpiar) {
			miCampoNombre.setText(null);						
			miCampoIncremento.setText(null);
			miCampo1.setText(null);
		}	
	}

}