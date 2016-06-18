import java.awt.*;
import javax.swing.*;

/**
 * 
 */
public class GuiApp extends JFrame {
    private Container contentPane;
    private JLabel lblName;
	private JLabel lblLastName;
	private JLabel lblAge;
	private JLabel lblConcept;
	private JLabel lblTitleAttribute;
	private JLabel lblPhysical;
	private JLabel lblForce;
	private JLabel lblDex;
	private JLabel lblVigor;
	private JLabel lblValueforce;
	private JLabel lblValueDex;
	private JLabel lblValueVigor;
	private JLabel lblSocial;
	private JLabel lblCharisma;
	private JLabel lblappearance;
	private JLabel lblManipulation;
	private JLabel lblValueCharisma;
	private JLabel lblValueManipulation;
	private JLabel lblValueAppearance;
	private JLabel lblMental;
	private JLabel lblReasoning;
	private JLabel lblIntelligence;
	private JLabel lblPerception;
	private JLabel lblValuePerception;
	private JLabel lblValueIntelligence;
	private JLabel lblValueReasoning;
	
    public GuiApp() {
        initWindow();
        initLabelHeader();
        initLabelAttribute();
    }
    
    private void initWindow() {
        JFrame jframe = new JFrame();
        
        this.setTitle("..::Gerador de Personagem v1::..");
        this.setBackground(Color.white);
        this.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.contentPane = getContentPane();
        this.contentPane.setLayout(null);
     
        this.setVisible(true);
    }
    
    private void initLabelHeader() {
        lblName = new JLabel();
        lblLastName = new JLabel();
        lblAge = new JLabel();
        lblConcept = new JLabel();
        
        //Nome
		this.lblName.setText("Nome:");
		this.contentPane.add(lblName);
		this.lblName.setBounds(new Rectangle(new Point(10, 55), lblName.getPreferredSize()));
		
        //Sobrenome
		this.lblLastName.setText("Sobrenome:");
		this.contentPane.add(lblLastName);
		this.lblLastName.setBounds(161, 55, lblLastName.getPreferredSize().width, 15);

		//Idade
		this.lblAge.setText("Idade:");
		this.contentPane.add(lblAge);
		this.lblAge.setBounds(new Rectangle(new Point(377, 55), lblAge.getPreferredSize()));

		//Conceito
		this.lblConcept.setText("Conceito:");
		this.contentPane.add(lblConcept);
		this.lblConcept.setBounds(new Rectangle(new Point(10, 40), lblConcept.getPreferredSize()));

    }
    
    private void initLabelAttribute() {
        lblTitleAttribute = new JLabel();
		
        lblPhysical = new JLabel();
        lblForce = new JLabel();
		lblDex = new JLabel();
		lblVigor = new JLabel();
		lblValueforce = new JLabel();
		lblValueDex = new JLabel();
		lblValueVigor = new JLabel();
		
		lblSocial = new JLabel();
		lblappearance = new JLabel();
		lblCharisma = new JLabel();
		lblManipulation = new JLabel();
        lblValueCharisma = new JLabel();
		lblValueManipulation = new JLabel();
		lblValueAppearance = new JLabel();
		
		lblMental = new JLabel();
		lblReasoning = new JLabel();
		lblIntelligence = new JLabel();
		lblPerception = new JLabel();
		
        //Tittulo
		lblTitleAttribute.setText("------ A T R I B U T O S ------");
		contentPane.add(lblTitleAttribute);
		lblTitleAttribute.setBounds(new Rectangle(new Point(212, 81), lblTitleAttribute.getPreferredSize()));

		//Fisicos
		lblPhysical.setText("FISICOS");
		lblPhysical.setForeground(new Color(0, 102, 204));
		contentPane.add(lblPhysical);
		lblPhysical.setBounds(new Rectangle(new Point(69, 106), lblPhysical.getPreferredSize()));
		
		//Força
		lblForce.setText("Força:");
		contentPane.add(lblForce);
		lblForce.setBounds(51, 128, lblForce.getPreferredSize().width, 15);

		lblValueforce.setText("ooooo");
		contentPane.add(lblValueforce);
		lblValueforce.setBounds(new Rectangle(new Point(94, 128), lblValueforce.getPreferredSize()));
		
		//Destreza
		lblDex.setText("Destreza:");
		contentPane.add(lblDex);
		lblDex.setBounds(new Rectangle(new Point(25, 148), lblDex.getPreferredSize()));
		
		lblValueDex.setText("ooooo");
		contentPane.add(lblValueDex);
		lblValueDex.setBounds(94, 148, 50, 15);

		//Vigor
		lblVigor.setText("Vigor:");
		contentPane.add(lblVigor);
		lblVigor.setBounds(new Rectangle(new Point(52, 168), lblVigor.getPreferredSize()));
		
		lblValueVigor.setText("ooooo");
		contentPane.add(lblValueVigor);
		lblValueVigor.setBounds(94, 168, 50, 15);
		
		//Social
		lblSocial.setText("SOCIAIS");
		lblSocial.setBackground(new Color(0, 51, 255));
		lblSocial.setForeground(new Color(0, 102, 204));
		contentPane.add(lblSocial);
		lblSocial.setBounds(new Rectangle(new Point(261, 106), lblSocial.getPreferredSize()));
		
		//Carisma
		lblCharisma.setText("Carisma:");
		contentPane.add(lblCharisma);
		lblCharisma.setBounds(new Rectangle(new Point(241, 127), lblCharisma.getPreferredSize()));
		
		lblValueCharisma.setText("ooooo");
		contentPane.add(lblValueCharisma);
		lblValueCharisma.setBounds(303, 127, 50, 15);

		//Manipulação
		lblManipulation.setText("Manipulação:");
		contentPane.add(lblManipulation);
		lblManipulation.setBounds(new Rectangle(new Point(208, 147), lblManipulation.getPreferredSize()));
		
		lblValueManipulation.setText("ooooo");
		contentPane.add(lblValueManipulation);
		lblValueManipulation.setBounds(303, 147, 50, 15);

		//Aparencia
		lblappearance.setText("Aparência:");
		contentPane.add(lblappearance);
		lblappearance.setBounds(new Rectangle(new Point(226, 168), lblappearance.getPreferredSize()));
		
		lblValueAppearance.setText("ooooo");
		contentPane.add(lblValueAppearance);
		lblValueAppearance.setBounds(303, 168, 50, 15);
		
		
    }
}

	