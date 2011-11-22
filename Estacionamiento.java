import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import lejos.nxt.*;
import lejos.nxt.remote.NXTCommand;
import lejos.pc.comm.*;

public class Estacionamiento extends JFrame
    implements ActionListener {
     
    private JTextField campoSegs, campoMins,campoestado,campo3
                       ,campo4,campo5,campo6,campo7,campo8
                       ,campo9,campo10,campo11,campo12,campo13
                       ,campo14,campo15,campo16,campo17,campo18
                       ,campo19,campo20,campo21,campo22,campo23,
                        campo24,campo25;
    
    private JLabel etiquetaSegs, etiquetaMins,etiquetaestado,etiqueta3,
                     etiqueta4,etiqueta5,etiqueta6,etiqueta7,etiqueta8,
                     etiqueta9,etiqueta10,etiqueta11,etiqueta12,etiqueta13,
                     etiqueta14,etiqueta15,etiqueta16,etiqueta17,etiqueta18,
                     etiqueta19,etiqueta20,etiqueta21,etiqueta22,etiqueta23,
                     etiqueta24,etiqueta25,etiquetasalida;
    
    private JButton boton;
    private JPanel panelcentral,panelbotones;
    
    private Timer temporizador;

  public static void main(String[] args) throws Exception {
        NXTConnector conn = new NXTConnector();	
         
    
        Estacionamiento marco = new Estacionamiento();
        marco.setSize(530,290);
        marco.setTitle("Control de Estacionamiento");
        marco.crearGUI();
        marco.setVisible(true);
        marco.setLocationRelativeTo(null);
    }

   

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout() );
        panelbotones = new JPanel();
        panelcentral = new JPanel(new GridLayout(9,6));
        panelcentral.setBackground(Color.WHITE);

        campoMins = new JTextField(6);
        panelcentral.add(campoMins);
        etiquetaMins = new JLabel("C1");
        panelcentral.add(etiquetaMins);
     
        campoSegs = new JTextField(6);
        panelcentral.add(campoSegs);
        etiquetaSegs = new JLabel("C2");
        panelcentral.add(etiquetaSegs);
        
        etiquetaestado= new JLabel("Estado");
        panelbotones.add(etiquetaestado);
        boton = new JButton("Conectar");
        panelbotones.add(boton);
        boton.addActionListener(this);
        campoestado = new JTextField(6);
        panelbotones.add(campoestado);
        
        campo3 = new JTextField(6);
        panelcentral.add(campo3);
        etiqueta3 = new JLabel("C3");
        panelcentral.add(etiqueta3);
   
        
        campo4 = new JTextField(6);
        panelcentral.add(campo4);
        etiqueta4 = new JLabel("C4");
        panelcentral.add(etiqueta4);
        
        
        campo5 = new JTextField(6);
        panelcentral.add(campo5);
        etiqueta5 = new JLabel("C5");
        panelcentral.add(etiqueta5);
        
        
        campo6 = new JTextField(6);
        panelcentral.add(campo6);
        etiqueta6 = new JLabel("C6");
        panelcentral.add(etiqueta6);
        
        
        campo7 = new JTextField(6);
        panelcentral.add(campo7);
        etiqueta7 = new JLabel("C7");
        panelcentral.add(etiqueta7);
        
        
        campo8 = new JTextField(6);
        panelcentral.add(campo8);
        etiqueta8 = new JLabel("C8");
        panelcentral.add(etiqueta8);
        
        campo9 = new JTextField(6);
        panelcentral.add(campo9);
        etiqueta9 = new JLabel("C9");
        panelcentral.add(etiqueta9);
   
        
        campo10 = new JTextField(6);
        panelcentral.add(campo10);
        etiqueta10 = new JLabel("C10");
        panelcentral.add(etiqueta10);
        
        
        campo11 = new JTextField(6);
        panelcentral.add(campo11);
        etiqueta11 = new JLabel("C11");
        panelcentral.add(etiqueta11);
        
        
        campo12 = new JTextField(6);
        panelcentral.add(campo12);
        etiqueta12 = new JLabel("C12");
        panelcentral.add(etiqueta12);
        
        
        campo13 = new JTextField(6);
        panelcentral.add(campo13);
        etiqueta13 = new JLabel("C13");
        panelcentral.add(etiqueta13);
        
        
        campo14 = new JTextField(6);
        panelcentral.add(campo14);
        etiqueta14 = new JLabel("C14");
        panelcentral.add(etiqueta14);
      
        campo15 = new JTextField(6);
        panelcentral.add(campo15);
        etiqueta15 = new JLabel("C15");
        panelcentral.add(etiqueta15);
        
        
        campo16 = new JTextField(6);
        panelcentral.add(campo16);
        etiqueta16 = new JLabel("C16");
        panelcentral.add(etiqueta16);
      
                
        campo17 = new JTextField(6);
        panelcentral.add(campo17);
        etiqueta17 = new JLabel("C17");
        panelcentral.add(etiqueta17);
   
        
        campo18 = new JTextField(6);
        panelcentral.add(campo18);
        etiqueta18 = new JLabel("C18");
        panelcentral.add(etiqueta18);
        
        
        campo19 = new JTextField(6);
        panelcentral.add(campo19);
        etiqueta19 = new JLabel("C19");
        panelcentral.add(etiqueta19);
        
        
        campo20 = new JTextField(6);
        panelcentral.add(campo20);
        etiqueta20 = new JLabel("C20");
        panelcentral.add(etiqueta20);
        
        
        campo21 = new JTextField(6);
        panelcentral.add(campo21);
        etiqueta21 = new JLabel("C21");
        panelcentral.add(etiqueta21);
        
        
        campo22 = new JTextField(6);
        panelcentral.add(campo22);
        etiqueta22 = new JLabel("C22");
        panelcentral.add(etiqueta22);
      
        campo23 = new JTextField(6);
        panelcentral.add(campo23);
        etiqueta23 = new JLabel("C23");
        panelcentral.add(etiqueta23);
        
        
        campo24 = new JTextField(6);
        panelcentral.add(campo24);
        etiqueta24 = new JLabel("C24");
        panelcentral.add(etiqueta24);
        
        etiquetasalida = new JLabel("<<< Salida");
        panelcentral.add(etiquetasalida);


        temporizador = new Timer(1, this);
        temporizador.start();
        
        ventana.add("South",panelbotones);
        ventana.add("Center",panelcentral);
    }
     
public void actionPerformed (ActionEvent event) {
       
boton.addActionListener(new ActionListener(){

public void actionPerformed(ActionEvent e){
 NXTConnector conn = new NXTConnector();
conn.addLogListener(new NXTCommLogListener() {
			public void logEvent(String message) {
				System.out.println(message);
                                campoestado.setText("Conectado");
                                
			}

			public void logEvent(Throwable throwable) {
				System.err.println(throwable.getMessage());
                               
			}			
		});
		conn.setDebug(true);
		if (!conn.connectTo("esclavo", NXTComm.LCP)) {
			System.err.println("Fallo conexion");
			campoestado.setText("Fallida");
			System.exit(1);
		}
		NXTCommand.getSingleton().setNXTComm(conn.getNXTComm());  
}
});   
        UltrasonicSensor SonicoA = new UltrasonicSensor(SensorPort.S1);
        SonicoA.continuous();
        UltrasonicSensor SonicoB = new UltrasonicSensor(SensorPort.S2);
        SonicoB.continuous();
        
   
        
        if (SonicoA.getDistance() > 15  ){
    campoMins.setText("Disponible" );
        }else {
            campoMins.setText("Ocupado");
        }
        
          if (SonicoB.getDistance() > 15  ){
    campoSegs.setText("Disponible" );
        }else {
            campoSegs.setText("Ocupado");
        }
        
        
         
   }
}
