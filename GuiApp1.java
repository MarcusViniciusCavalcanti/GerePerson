import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Thu Jun 16 19:46:01 BRT 2016
 */



/**
 * @author Marcus Cavalcanti
 */
public class GuiApp1 extends JFrame {
	public GuiApp1() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Marcus Cavalcanti
		generate = new JButton();
		lblName = new JLabel();
		lblLastName = new JLabel();
		lblAge = new JLabel();
		lblConcept = new JLabel();
		lblTitleAttribute = new JLabel();
		lblForce = new JLabel();
		lblDex = new JLabel();
		lblVigor = new JLabel();
		lblCharisma = new JLabel();
		lblManipulation = new JLabel();
		lblPhysical = new JLabel();
		lblSocial = new JLabel();
		lblappearance = new JLabel();
		lblValueforce = new JLabel();
		lblValueDex = new JLabel();
		lblValueVigor = new JLabel();
		lblMental = new JLabel();
		lblReasoning = new JLabel();
		lblIntelligence = new JLabel();
		lblPerception = new JLabel();
		lblValueCharisma = new JLabel();
		lblValueManipulation = new JLabel();
		lblValueAppearance = new JLabel();
		lblValuePerception = new JLabel();
		lblValueIntelligence = new JLabel();
		lblValuePerception3 = new JLabel();
		lblTitleSkill = new JLabel();
		lblTalent = new JLabel();
		lblExpertise = new JLabel();
		lblKnowledge = new JLabel();
		lblRepresentation = new JLabel();
		lblValueRepresentation = new JLabel();
		lblReadiness = new JLabel();
		lblValueReadiness = new JLabel();
		lblValueSport = new JLabel();
		lblSport = new JLabel();
		lblHandicraft = new JLabel();
		lblArchery = new JLabel();
		lblEmpathyAnimal = new JLabel();
		lblValueEmpathyAnimal = new JLabel();
		lblValueArchery = new JLabel();
		lblValueHandicraft = new JLabel();
		lblInvestigation = new JLabel();
		lblKnowPopular = new JLabel();
		lblInstruction = new JLabel();
		lblValueInstruction = new JLabel();
		lblValueKnowPopular = new JLabel();
		lblValueInvestigation = new JLabel();
		lblFight = new JLabel();
		lblValueFight = new JLabel();
		lblFlee = new JLabel();
		lblValueFlee = new JLabel();
		lblEmpathy = new JLabel();
		lblValueEmpathy = new JLabel();
		lblIntimidation = new JLabel();
		lblValueIntimidation = new JLabel();
		lblCrime = new JLabel();
		lblValueCrime = new JLabel();
		lblLeadership = new JLabel();
		lblValueLeadership = new JLabel();
		lblChin = new JLabel();
		lblValueChin = new JLabel();
		lblFormality = new JLabel();
		lblValueFormality = new JLabel();
		lblHerbalism = new JLabel();
		lblValueHerbalism = new JLabel();
		lblBladedWeapons = new JLabel();
		lblValueBladedWeapons = new JLabel();
		lblMusic = new JLabel();
		lblValueMusic = new JLabel();
		lblHorseRiding = new JLabel();
		lblValueDex6 = new JLabel();
		lblStealth = new JLabel();
		lblValueVigor7 = new JLabel();
		lblSuvivor = new JLabel();
		lblValueVigor8 = new JLabel();
		lblClaim = new JLabel();
		lblValueClaim = new JLabel();
		lblLinguistics = new JLabel();
		lblValueDex7 = new JLabel();
		lblMedicne = new JLabel();
		lblValueMedicne = new JLabel();
		lblOccltism = new JLabel();
		lblValueOccltism = new JLabel();
		lblPolice = new JLabel();
		lblValuePolice = new JLabel();
		lblScience = new JLabel();
		lblValueScience = new JLabel();
		lblNoble = new JLabel();
		lblValueNoble = new JLabel();
		lblWillPower = new JLabel();
		lblValueWillPower = new JLabel();
		ckBoxTXT = new JCheckBox();
		lblInformationTXT = new JLabel();

		//======== this ========
		setTitle("..::Gerador de Personagem v1::..");
		setBackground(Color.white);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		setVisible(true);
		contentPane.setLayout(null);

		//---- generate ----
		generate.setText("Gerar");
		contentPane.add(generate);
		generate.setBounds(new Rectangle(new Point(5, 10), generate.getPreferredSize()));

		//---- lblName ----
		lblName.setText("Nome:");
		contentPane.add(lblName);
		lblName.setBounds(new Rectangle(new Point(10, 55), lblName.getPreferredSize()));

		//---- lblLastName ----
		lblLastName.setText("Sobrenome:");
		contentPane.add(lblLastName);
		lblLastName.setBounds(161, 55, lblLastName.getPreferredSize().width, 15);

		//---- lblAge ----
		lblAge.setText("Idade:");
		contentPane.add(lblAge);
		lblAge.setBounds(new Rectangle(new Point(377, 55), lblAge.getPreferredSize()));

		//---- lblConcept ----
		lblConcept.setText("Conceito:");
		contentPane.add(lblConcept);
		lblConcept.setBounds(new Rectangle(new Point(10, 40), lblConcept.getPreferredSize()));

		//---- lblTitleAttribute ----
		lblTitleAttribute.setText("------ A T R I B U T O S ------");
		contentPane.add(lblTitleAttribute);
		lblTitleAttribute.setBounds(new Rectangle(new Point(212, 81), lblTitleAttribute.getPreferredSize()));

		//---- lblForce ----
		lblForce.setText("For\u00e7a:");
		contentPane.add(lblForce);
		lblForce.setBounds(54, 128, lblForce.getPreferredSize().width, 15);

		//---- lblDex ----
		lblDex.setText("Destreza:");
		contentPane.add(lblDex);
		lblDex.setBounds(new Rectangle(new Point(34, 148), lblDex.getPreferredSize()));

		//---- lblVigor ----
		lblVigor.setText("Vigor:");
		contentPane.add(lblVigor);
		lblVigor.setBounds(57, 168, 36, lblVigor.getPreferredSize().height);

		//---- lblCharisma ----
		lblCharisma.setText("Carisma:");
		contentPane.add(lblCharisma);
		lblCharisma.setBounds(new Rectangle(new Point(239, 127), lblCharisma.getPreferredSize()));

		//---- lblManipulation ----
		lblManipulation.setText("manipula\u00e7\u00e3o:");
		contentPane.add(lblManipulation);
		lblManipulation.setBounds(new Rectangle(new Point(209, 147), lblManipulation.getPreferredSize()));

		//---- lblPhysical ----
		lblPhysical.setText("FISICOS");
		lblPhysical.setForeground(new Color(0, 102, 204));
		contentPane.add(lblPhysical);
		lblPhysical.setBounds(new Rectangle(new Point(69, 106), lblPhysical.getPreferredSize()));

		//---- lblSocial ----
		lblSocial.setText("SOCIAIS");
		lblSocial.setBackground(new Color(0, 51, 255));
		lblSocial.setForeground(new Color(0, 102, 204));
		contentPane.add(lblSocial);
		lblSocial.setBounds(new Rectangle(new Point(261, 106), lblSocial.getPreferredSize()));

		//---- lblappearance ----
		lblappearance.setText("Apar\u00eancia:");
		contentPane.add(lblappearance);
		lblappearance.setBounds(new Rectangle(new Point(226, 168), lblappearance.getPreferredSize()));

		//---- lblValueforce ----
		lblValueforce.setText("ooooo");
		contentPane.add(lblValueforce);
		lblValueforce.setBounds(new Rectangle(new Point(94, 128), lblValueforce.getPreferredSize()));

		//---- lblValueDex ----
		lblValueDex.setText("ooooo");
		contentPane.add(lblValueDex);
		lblValueDex.setBounds(94, 148, 50, 15);

		//---- lblValueVigor ----
		lblValueVigor.setText("ooooo");
		contentPane.add(lblValueVigor);
		lblValueVigor.setBounds(94, 168, 50, 15);

		//---- lblMental ----
		lblMental.setText("MENTAIS");
		lblMental.setBackground(new Color(0, 51, 255));
		lblMental.setForeground(new Color(0, 102, 204));
		contentPane.add(lblMental);
		lblMental.setBounds(430, 105, 56, 15);

		//---- lblReasoning ----
		lblReasoning.setText("Racioc\u00ednio:");
		contentPane.add(lblReasoning);
		lblReasoning.setBounds(406, 168, 67, 15);

		//---- lblIntelligence ----
		lblIntelligence.setText("Intelig\u00eancia:");
		contentPane.add(lblIntelligence);
		lblIntelligence.setBounds(397, 148, 77, 15);

		//---- lblPerception ----
		lblPerception.setText("Percep\u00e7\u00e3o:");
		contentPane.add(lblPerception);
		lblPerception.setBounds(402, 128, 76, 15);

		//---- lblValueCharisma ----
		lblValueCharisma.setText("ooooo");
		contentPane.add(lblValueCharisma);
		lblValueCharisma.setBounds(295, 127, 40, 15);

		//---- lblValueManipulation ----
		lblValueManipulation.setText("ooooo");
		contentPane.add(lblValueManipulation);
		lblValueManipulation.setBounds(294, 147, 40, 15);

		//---- lblValueAppearance ----
		lblValueAppearance.setText("ooooo");
		contentPane.add(lblValueAppearance);
		lblValueAppearance.setBounds(294, 168, 40, 15);

		//---- lblValuePerception ----
		lblValuePerception.setText("ooooo");
		contentPane.add(lblValuePerception);
		lblValuePerception.setBounds(474, 128, 40, 15);

		//---- lblValueIntelligence ----
		lblValueIntelligence.setText("ooooo");
		contentPane.add(lblValueIntelligence);
		lblValueIntelligence.setBounds(474, 148, 40, 15);

		//---- lblValuePerception3 ----
		lblValuePerception3.setText("ooooo");
		contentPane.add(lblValuePerception3);
		lblValuePerception3.setBounds(474, 168, 40, 15);

		//---- lblTitleSkill ----
		lblTitleSkill.setText("------ H A B I L I D A D E S ------");
		contentPane.add(lblTitleSkill);
		lblTitleSkill.setBounds(200, 195, 176, 15);

		//---- lblTalent ----
		lblTalent.setText("TALENTOS");
		lblTalent.setForeground(new Color(0, 102, 204));
		contentPane.add(lblTalent);
		lblTalent.setBounds(65, 221, 65, 15);

		//---- lblExpertise ----
		lblExpertise.setText("EXPERTISE");
		lblExpertise.setForeground(new Color(0, 102, 204));
		contentPane.add(lblExpertise);
		lblExpertise.setBounds(258, 222, 70, 15);

		//---- lblKnowledge ----
		lblKnowledge.setText("KNOWLEDGE");
		lblKnowledge.setForeground(new Color(0, 102, 204));
		contentPane.add(lblKnowledge);
		lblKnowledge.setBounds(455, 222, 80, 15);

		//---- lblRepresentation ----
		lblRepresentation.setText("Representa\u00e7\u00e3o:");
		contentPane.add(lblRepresentation);
		lblRepresentation.setBounds(31, 243, 102, 15);

		//---- lblValueRepresentation ----
		lblValueRepresentation.setText("ooooo");
		contentPane.add(lblValueRepresentation);
		lblValueRepresentation.setBounds(135, 243, 40, 15);

		//---- lblReadiness ----
		lblReadiness.setText("Prontid\u00e3o:");
		contentPane.add(lblReadiness);
		lblReadiness.setBounds(65, 263, 68, 15);

		//---- lblValueReadiness ----
		lblValueReadiness.setText("ooooo");
		contentPane.add(lblValueReadiness);
		lblValueReadiness.setBounds(135, 263, 40, 15);

		//---- lblValueSport ----
		lblValueSport.setText("ooooo");
		contentPane.add(lblValueSport);
		lblValueSport.setBounds(135, 283, 40, 15);

		//---- lblSport ----
		lblSport.setText("Esportes:");
		contentPane.add(lblSport);
		lblSport.setBounds(71, 283, 62, 15);

		//---- lblHandicraft ----
		lblHandicraft.setText("Artesanato:");
		contentPane.add(lblHandicraft);
		lblHandicraft.setBounds(259, 283, 76, 15);

		//---- lblArchery ----
		lblArchery.setText("Arqueirismo:");
		contentPane.add(lblArchery);
		lblArchery.setBounds(255, 264, 80, 15);

		//---- lblEmpathyAnimal ----
		lblEmpathyAnimal.setText("Empatia com animais:");
		contentPane.add(lblEmpathyAnimal);
		lblEmpathyAnimal.setBounds(195, 245, 140, 15);

		//---- lblValueEmpathyAnimal ----
		lblValueEmpathyAnimal.setText("ooooo");
		contentPane.add(lblValueEmpathyAnimal);
		lblValueEmpathyAnimal.setBounds(335, 245, 40, 15);

		//---- lblValueArchery ----
		lblValueArchery.setText("ooooo");
		contentPane.add(lblValueArchery);
		lblValueArchery.setBounds(335, 264, 40, 15);

		//---- lblValueHandicraft ----
		lblValueHandicraft.setText("ooooo");
		contentPane.add(lblValueHandicraft);
		lblValueHandicraft.setBounds(335, 283, 40, 15);

		//---- lblInvestigation ----
		lblInvestigation.setText("Investiga\u00e7\u00e3o:");
		contentPane.add(lblInvestigation);
		lblInvestigation.setBounds(431, 282, 86, 15);

		//---- lblKnowPopular ----
		lblKnowPopular.setText("Sabedoria popular:");
		contentPane.add(lblKnowPopular);
		lblKnowPopular.setBounds(394, 263, 123, 15);

		//---- lblInstruction ----
		lblInstruction.setText("Instru\u00e7\u00e3o:");
		contentPane.add(lblInstruction);
		lblInstruction.setBounds(452, 243, 65, 15);

		//---- lblValueInstruction ----
		lblValueInstruction.setText("ooooo");
		contentPane.add(lblValueInstruction);
		lblValueInstruction.setBounds(517, 243, 43, 15);

		//---- lblValueKnowPopular ----
		lblValueKnowPopular.setText("ooooo");
		contentPane.add(lblValueKnowPopular);
		lblValueKnowPopular.setBounds(517, 263, 43, 15);

		//---- lblValueInvestigation ----
		lblValueInvestigation.setText("ooooo");
		contentPane.add(lblValueInvestigation);
		lblValueInvestigation.setBounds(517, 282, 43, 15);

		//---- lblFight ----
		lblFight.setText("Briga:");
		contentPane.add(lblFight);
		lblFight.setBounds(95, 303, 38, 15);

		//---- lblValueFight ----
		lblValueFight.setText("ooooo");
		contentPane.add(lblValueFight);
		lblValueFight.setBounds(135, 303, 40, 15);

		//---- lblFlee ----
		lblFlee.setText("Esquiva:");
		contentPane.add(lblFlee);
		lblFlee.setBounds(79, 323, 54, 15);

		//---- lblValueFlee ----
		lblValueFlee.setText("ooooo");
		contentPane.add(lblValueFlee);
		lblValueFlee.setBounds(135, 323, 40, 15);

		//---- lblEmpathy ----
		lblEmpathy.setText("Empatia:");
		contentPane.add(lblEmpathy);
		lblEmpathy.setBounds(75, 343, 58, 15);

		//---- lblValueEmpathy ----
		lblValueEmpathy.setText("ooooo");
		contentPane.add(lblValueEmpathy);
		lblValueEmpathy.setBounds(135, 343, 40, 15);

		//---- lblIntimidation ----
		lblIntimidation.setText("Intimida\u00e7\u00e3o:");
		contentPane.add(lblIntimidation);
		lblIntimidation.setBounds(55, 363, 78, 15);

		//---- lblValueIntimidation ----
		lblValueIntimidation.setText("ooooo");
		contentPane.add(lblValueIntimidation);
		lblValueIntimidation.setBounds(135, 363, 40, 15);

		//---- lblCrime ----
		lblCrime.setText("Crime:");
		contentPane.add(lblCrime);
		lblCrime.setBounds(92, 383, 41, 15);

		//---- lblValueCrime ----
		lblValueCrime.setText("ooooo");
		contentPane.add(lblValueCrime);
		lblValueCrime.setBounds(135, 383, 40, 15);

		//---- lblLeadership ----
		lblLeadership.setText("Lideran\u00e7a:");
		contentPane.add(lblLeadership);
		lblLeadership.setBounds(66, 403, 67, 15);

		//---- lblValueLeadership ----
		lblValueLeadership.setText("ooooo");
		contentPane.add(lblValueLeadership);
		lblValueLeadership.setBounds(135, 403, 40, 15);

		//---- lblChin ----
		lblChin.setText("L\u00e1bia:");
		contentPane.add(lblChin);
		lblChin.setBounds(94, 423, 39, 15);

		//---- lblValueChin ----
		lblValueChin.setText("ooooo");
		contentPane.add(lblValueChin);
		lblValueChin.setBounds(135, 423, 40, 15);

		//---- lblFormality ----
		lblFormality.setText("Etiqueta:");
		contentPane.add(lblFormality);
		lblFormality.setBounds(275, 302, 60, 15);

		//---- lblValueFormality ----
		lblValueFormality.setText("ooooo");
		contentPane.add(lblValueFormality);
		lblValueFormality.setBounds(335, 302, 40, 15);

		//---- lblHerbalism ----
		lblHerbalism.setText("Herborismo:");
		contentPane.add(lblHerbalism);
		lblHerbalism.setBounds(256, 323, 79, 15);

		//---- lblValueHerbalism ----
		lblValueHerbalism.setText("ooooo");
		contentPane.add(lblValueHerbalism);
		lblValueHerbalism.setBounds(335, 322, 40, 15);

		//---- lblBladedWeapons ----
		lblBladedWeapons.setText("Armas brancas:");
		contentPane.add(lblBladedWeapons);
		lblBladedWeapons.setBounds(235, 344, 100, 15);

		//---- lblValueBladedWeapons ----
		lblValueBladedWeapons.setText("ooooo");
		contentPane.add(lblValueBladedWeapons);
		lblValueBladedWeapons.setBounds(335, 343, 40, 15);

		//---- lblMusic ----
		lblMusic.setText("M\u00fasica:");
		contentPane.add(lblMusic);
		lblMusic.setBounds(284, 365, 51, 15);

		//---- lblValueMusic ----
		lblValueMusic.setText("ooooo");
		contentPane.add(lblValueMusic);
		lblValueMusic.setBounds(335, 364, 40, 15);

		//---- lblHorseRiding ----
		lblHorseRiding.setText("Cavalgar:");
		contentPane.add(lblHorseRiding);
		lblHorseRiding.setBounds(274, 386, 61, 15);

		//---- lblValueDex6 ----
		lblValueDex6.setText("ooooo");
		contentPane.add(lblValueDex6);
		lblValueDex6.setBounds(335, 386, 40, 15);

		//---- lblStealth ----
		lblStealth.setText("Furtividade:");
		contentPane.add(lblStealth);
		lblStealth.setBounds(259, 406, 76, 15);

		//---- lblValueVigor7 ----
		lblValueVigor7.setText("ooooo");
		contentPane.add(lblValueVigor7);
		lblValueVigor7.setBounds(335, 405, 40, 15);

		//---- lblSuvivor ----
		lblSuvivor.setText("Sobreviv\u00eancia:");
		contentPane.add(lblSuvivor);
		lblSuvivor.setBounds(243, 424, 92, 15);

		//---- lblValueVigor8 ----
		lblValueVigor8.setText("ooooo");
		contentPane.add(lblValueVigor8);
		lblValueVigor8.setBounds(335, 424, 40, 15);

		//---- lblClaim ----
		lblClaim.setText("Direito:");
		contentPane.add(lblClaim);
		lblClaim.setBounds(470, 302, 47, 15);

		//---- lblValueClaim ----
		lblValueClaim.setText("ooooo");
		contentPane.add(lblValueClaim);
		lblValueClaim.setBounds(517, 302, 43, 15);

		//---- lblLinguistics ----
		lblLinguistics.setText("Lingu\u00edstica:");
		contentPane.add(lblLinguistics);
		lblLinguistics.setBounds(445, 322, 72, 15);

		//---- lblValueDex7 ----
		lblValueDex7.setText("ooooo");
		contentPane.add(lblValueDex7);
		lblValueDex7.setBounds(517, 322, 43, 14);

		//---- lblMedicne ----
		lblMedicne.setText("Medicina:");
		contentPane.add(lblMedicne);
		lblMedicne.setBounds(455, 343, 62, 15);

		//---- lblValueMedicne ----
		lblValueMedicne.setText("ooooo");
		contentPane.add(lblValueMedicne);
		lblValueMedicne.setBounds(517, 343, 43, 15);

		//---- lblOccltism ----
		lblOccltism.setText("Ocultismo:");
		contentPane.add(lblOccltism);
		lblOccltism.setBounds(450, 365, 67, 15);

		//---- lblValueOccltism ----
		lblValueOccltism.setText("ooooo");
		contentPane.add(lblValueOccltism);
		lblValueOccltism.setBounds(517, 365, 43, 15);

		//---- lblPolice ----
		lblPolice.setText("Pol\u00edcia:");
		contentPane.add(lblPolice);
		lblPolice.setBounds(470, 386, 47, 15);

		//---- lblValuePolice ----
		lblValuePolice.setText("ooooo");
		contentPane.add(lblValuePolice);
		lblValuePolice.setBounds(517, 386, 43, 15);

		//---- lblScience ----
		lblScience.setText("Ci\u00eancia:");
		contentPane.add(lblScience);
		lblScience.setBounds(465, 404, 52, 15);

		//---- lblValueScience ----
		lblValueScience.setText("ooooo");
		contentPane.add(lblValueScience);
		lblValueScience.setBounds(517, 403, 43, 15);

		//---- lblNoble ----
		lblNoble.setText("Senesc\u00e1lia:");
		contentPane.add(lblNoble);
		lblNoble.setBounds(442, 422, 75, 15);

		//---- lblValueNoble ----
		lblValueNoble.setText("ooooo");
		contentPane.add(lblValueNoble);
		lblValueNoble.setBounds(517, 422, 43, 15);

		//---- lblWillPower ----
		lblWillPower.setText("For\u00e7a de vontade");
		contentPane.add(lblWillPower);
		lblWillPower.setBounds(182, 459, 114, 15);

		//---- lblValueWillPower ----
		lblValueWillPower.setText("oooooooooooo");
		contentPane.add(lblValueWillPower);
		lblValueWillPower.setBounds(303, 459, 99, 15);

		//---- ckBoxTXT ----
		ckBoxTXT.setText("Gerar arquivo TXT");
		contentPane.add(ckBoxTXT);
		ckBoxTXT.setBounds(new Rectangle(new Point(85, 10), ckBoxTXT.getPreferredSize()));

		//---- lblInformationTXT ----
		lblInformationTXT.setText("Arquivo gerado em: GerePerson/ArquivosTXT");
		lblInformationTXT.setForeground(Color.red);
		contentPane.add(lblInformationTXT);
		lblInformationTXT.setBounds(new Rectangle(new Point(240, 12), lblInformationTXT.getPreferredSize()));

		((JComponent)contentPane).setPreferredSize(new Dimension(595, 505));
		setSize(595, 505);
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Marcus Cavalcanti
	private JButton generate;
	private JLabel lblName;
	private JLabel lblLastName;
	private JLabel lblAge;
	private JLabel lblConcept;
	private JLabel lblTitleAttribute;
	private JLabel lblForce;
	private JLabel lblDex;
	private JLabel lblVigor;
	private JLabel lblCharisma;
	private JLabel lblManipulation;
	private JLabel lblPhysical;
	private JLabel lblSocial;
	private JLabel lblappearance;
	private JLabel lblValueforce;
	private JLabel lblValueDex;
	private JLabel lblValueVigor;
	private JLabel lblMental;
	private JLabel lblReasoning;
	private JLabel lblIntelligence;
	private JLabel lblPerception;
	private JLabel lblValueCharisma;
	private JLabel lblValueManipulation;
	private JLabel lblValueAppearance;
	private JLabel lblValuePerception;
	private JLabel lblValueIntelligence;
	private JLabel lblValuePerception3;
	private JLabel lblTitleSkill;
	private JLabel lblTalent;
	private JLabel lblExpertise;
	private JLabel lblKnowledge;
	private JLabel lblRepresentation;
	private JLabel lblValueRepresentation;
	private JLabel lblReadiness;
	private JLabel lblValueReadiness;
	private JLabel lblValueSport;
	private JLabel lblSport;
	private JLabel lblHandicraft;
	private JLabel lblArchery;
	private JLabel lblEmpathyAnimal;
	private JLabel lblValueEmpathyAnimal;
	private JLabel lblValueArchery;
	private JLabel lblValueHandicraft;
	private JLabel lblInvestigation;
	private JLabel lblKnowPopular;
	private JLabel lblInstruction;
	private JLabel lblValueInstruction;
	private JLabel lblValueKnowPopular;
	private JLabel lblValueInvestigation;
	private JLabel lblFight;
	private JLabel lblValueFight;
	private JLabel lblFlee;
	private JLabel lblValueFlee;
	private JLabel lblEmpathy;
	private JLabel lblValueEmpathy;
	private JLabel lblIntimidation;
	private JLabel lblValueIntimidation;
	private JLabel lblCrime;
	private JLabel lblValueCrime;
	private JLabel lblLeadership;
	private JLabel lblValueLeadership;
	private JLabel lblChin;
	private JLabel lblValueChin;
	private JLabel lblFormality;
	private JLabel lblValueFormality;
	private JLabel lblHerbalism;
	private JLabel lblValueHerbalism;
	private JLabel lblBladedWeapons;
	private JLabel lblValueBladedWeapons;
	private JLabel lblMusic;
	private JLabel lblValueMusic;
	private JLabel lblHorseRiding;
	private JLabel lblValueDex6;
	private JLabel lblStealth;
	private JLabel lblValueVigor7;
	private JLabel lblSuvivor;
	private JLabel lblValueVigor8;
	private JLabel lblClaim;
	private JLabel lblValueClaim;
	private JLabel lblLinguistics;
	private JLabel lblValueDex7;
	private JLabel lblMedicne;
	private JLabel lblValueMedicne;
	private JLabel lblOccltism;
	private JLabel lblValueOccltism;
	private JLabel lblPolice;
	private JLabel lblValuePolice;
	private JLabel lblScience;
	private JLabel lblValueScience;
	private JLabel lblNoble;
	private JLabel lblValueNoble;
	private JLabel lblWillPower;
	private JLabel lblValueWillPower;
	private JCheckBox ckBoxTXT;
	private JLabel lblInformationTXT;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
