import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 22.12.2021
 * @author 
 */

public class GUITG extends JFrame {
  // Anfang Attribute
  private JLabel LTrainingstage = new JLabel();
  private JLabel lTrainingsziel = new JLabel();
  private JLabel LTrainingsOrt = new JLabel();
  private JLabel LfitnessplanGenerator = new JLabel();
  protected JButton bSpeichern = new JButton();
  protected JButton bErstellen = new JButton();
  protected JTextField EGTrainingstage = new JTextField();
  protected JTextField EGTrainingsziel = new JTextField();
  protected JTextField EGTrainingsort = new JTextField();
  protected JTextArea AGtrainingsplan = new JTextArea("");
  protected JScrollPane AGtrainigsplanScrollPane = new JScrollPane(AGtrainingsplan);
  // Ende Attribute
  
  public GUITG() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 751; 
    int frameHeight = 588;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GUITG");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    LTrainingstage.setBounds(45, 86, 192, 28);
    LTrainingstage.setText(" Wie viele Trainingstage? (1-6)");
    LTrainingstage.setFont(new Font("Arial Narrow", Font.BOLD, 16));
    LTrainingstage.setHorizontalAlignment(SwingConstants.LEFT);
    LTrainingstage.setBackground(Color.WHITE);
    LTrainingstage.setOpaque(true);
    cp.add(LTrainingstage);
    lTrainingsziel.setBounds(45, 155, 265, 28);
    lTrainingsziel.setText("Trainingsziel? (Muskelaufbau, Abnhemen)");
    lTrainingsziel.setHorizontalAlignment(SwingConstants.LEFT);
    lTrainingsziel.setFont(new Font("Arial Narrow", Font.BOLD, 16));
    cp.add(lTrainingsziel);
    LTrainingsOrt.setBounds(45, 229, 180, 28);
    LTrainingsOrt.setText("Trainingsort? (Gym,Home)");
    LTrainingsOrt.setHorizontalAlignment(SwingConstants.LEFT);
    LTrainingsOrt.setFont(new Font("Arial Narrow", Font.BOLD, 16));
    cp.add(LTrainingsOrt);
    LfitnessplanGenerator.setBounds(-3, 3, 741, 46);
    LfitnessplanGenerator.setText("Fitness Plan Generator");
    LfitnessplanGenerator.setHorizontalAlignment(SwingConstants.CENTER);
    LfitnessplanGenerator.setFont(new Font("Arial Narrow", Font.BOLD, 36));
    LfitnessplanGenerator.setBackground(Color.WHITE);
    LfitnessplanGenerator.setOpaque(true);
    cp.add(LfitnessplanGenerator);
    cp.setBackground(Color.WHITE);
    bSpeichern.setBounds(570, 155, 99, 28);
    bSpeichern.setText("Speichern");
    bSpeichern.setMargin(new Insets(2, 2, 2, 2));
    bSpeichern.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSpeichern_ActionPerformed(evt);
      }
    });
    bSpeichern.setFont(new Font("Arial", Font.BOLD, 16));
    cp.add(bSpeichern);
    bErstellen.setBounds(570, 229, 83, 28);
    bErstellen.setText("Erstellen");
    bErstellen.setMargin(new Insets(2, 2, 2, 2));
    bErstellen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bErstellen_ActionPerformed(evt);
      }
    });
    bErstellen.setFont(new Font("Arial", Font.BOLD, 16));
    cp.add(bErstellen);
    EGTrainingstage.setBounds(330, 86, 35, 28);
    EGTrainingstage.setFont(new Font("Arial", Font.PLAIN, 16));
    EGTrainingstage.setForeground(Color.BLACK);
    EGTrainingstage.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(EGTrainingstage);
    EGTrainingsziel.setBounds(330, 155, 180, 28);
    EGTrainingsziel.setHorizontalAlignment(SwingConstants.CENTER);
    EGTrainingsziel.setFont(new Font("Arial", Font.PLAIN, 16));
    EGTrainingsziel.setForeground(Color.BLACK);
    cp.add(EGTrainingsziel);
    EGTrainingsort.setBounds(330, 229, 180, 28);
    EGTrainingsort.setHorizontalAlignment(SwingConstants.CENTER);
    EGTrainingsort.setFont(new Font("Arial", Font.PLAIN, 16));
    cp.add(EGTrainingsort);
    AGtrainigsplanScrollPane.setBounds(0, 272, 745, 281);
    AGtrainingsplan.setTabSize(75);
    AGtrainingsplan.setFont(new Font("Arial Narrow", Font.PLAIN, 16));
    AGtrainingsplan.setForeground(Color.BLACK);
    cp.add(AGtrainigsplanScrollPane);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GUITG
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUITG();
  } // end of main
  
  public void bSpeichern_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bSpeichern_ActionPerformed

  public void bErstellen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bErstellen_ActionPerformed

  // Ende Methoden
} // end of class GUITG
