import java.awt.event.ActionEvent;

public class FitnessPlanGenerator extends GUITG {
	
	
	
	protected static int trainingsTage;
	protected static String trainingsZiel;
	protected static String trainingsOrt;
	private String gkGym = "�bung 1: Flachbankdr�cken Maschine, S�tze: 3, Wiederholungen: 10" + "\n" + "�bung 2: Butterfly, S�tze: 3, Wiederholungen: 10" +"\n" + "�bung 3: Latzug zur Brust, S�tze: 3, Wiederholungen: 10" + "\n" + "�bung 4: Rudern am Kabel sitzend, S�tze: 3, Wiederholungen: 10" + "\n" + "�bung 5: Seitheben Kurzhanteln, S�tze: 3, Wiederholungen: 10" + "\n" + "�bung 6: SZ Curls, S�tze: 3, Wiederholungen: 10" + "\n"+"�bung 7: Trizepsdr�cken am Kabel, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 8: Beinpresse, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 9: Beincurls, S�tze: 3, Wiederholungen: 10"+ "\n"+"�bung 10: Crunch, S�tze: 3, Wiederholungen: 10"  ;
	private String gkHome = "�bung 1: Liegest�tze S�tze: 3, Wiederholungen: 5 - 15" + "\n"+"�bung 2: Squads ohne Gewicht , S�tze: 3, Wiederholungen: 10 - 25"+"\n"+"�bung 3: Rudern an der Tischkante, S�tze: 3, Wiederholungen: 5 - 12"+"\n"+"�bung 4: Wandsitzen (Beine 90�) , S�tze: 3, Wiederholungen: 30 - 50 sec"+"\n"+"�bung 5: Crunches, S�tze: 3, Wiederholungen: 10 - 30";
	private String okGym =	"�bung 1: Bankdr�cken, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 2: Dips, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 3: Push ups, S�tze: 3, Wiederholungen: MAX"+"\n"+"�bung 4: Rudern(Maschine oder Kabel), S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 5: Military Press, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 6: Seitheben, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 7: SZ-Curls, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 8: Pushdowns, S�tze: 3, Wiederholungen: 10";
	private String okHome =	"�bung 1: breite Liegest�tze, S�tze: 3, Wiederholungen: 10 - 15"+"\n"+"�bung 2: enge Liegest�tze, S�tze: 3, Wiederholungen: 10 - 15"+"\n"+"�bung 3: Kopf�ber Schulterdr�cken, S�tze: 3, Wiederholungen: 10 - 15"+"\n"+"�bung 4: Dips, S�tze: 3, Wiederholungen: 10 - 15"+"\n"+"�bung 5: Crunches, S�tze: 3, Wiederholungen: 10 - 20";
	private String lgGym ="�bung 1: Kreuzheben, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 2: Beinpresse, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 3: Ausfallschritte mit Gewichten, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 4: Wandenheben am Ger�t, S�tze: 3, Wiederholungen: 10";
	private String lgHome ="�bung 1: Squats, S�tze: 3, Wiederholungen: 10 - 30"+"\n"+"�bung 2: Slow Walk, S�tze: 3, Wiederholungen: 30 - 45 sec"+"\n"+"�bung 3: Ausfallschritte, S�tze: 3, Wiederholungen: 10 - 15"+"\n"+"�bung 4: Wandenheben am Ger�t, S�tze: 3, Wiederholungen: 10 - 35";
	private String pushdayGym ="�bung 1: Bankdr�cken mit LH, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 2: Schr�gbankdr�cken mit KH, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 3: Butterfly, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 4: Seitheben mit KH, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 5: enges Bankdr�cken mit SZ-Stange, S�tze: 3, Wiederholungen: 10";
	private String pushdayHome ="�bung 1: Breite Liegest�tze, S�tze: 3, Wiederholungen: MAX"+"\n"+"�bung 2: Dips, S�tze: 3, Wiederholungen: MAX"+"\n"+"�bung 3: �berkopf Schulterdr�cken, S�tze: 3, Wiederholungen: MAX"+"\n"+"�bung 4: enge Liegest�tze, S�tze: 3, Wiederholungen: MAX"+"\n"+"�bung 5: Butterfly ohne Gewicht, S�tze: 3, Wiederholungen: 10 - 20";
	private String pulldayGym ="�bung 1: Push ups, S�tze: 3, Wiederholungen: MAX"+"\n"+"�bung 2: Enges Kabelrudern, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 3: Rudermaschine, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 4: Butterfly Reverse, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 5: Langhantelcurls, S�tze: 3, Wiederholungen: 10";
	private String pulldayHome ="�bung 1: Push ups, S�tze: 3, Wiederholungen: MAX"+"\n"+"�bung 2: Pull ups, S�tze: 3, Wiederholungen: MAX"+"\n"+"�bung 3: Rudern an Tischkante, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 4: Butterfly Reverse gegen Schwerkraft, S�tze: 3, Wiederholungen: 10"+"\n"+"�bung 5: Curls mit eigenen Wiederstand, S�tze: 3, Wiederholungen: 10";
	private String cardio = "Jede �bung 45 sec ausf�hren danach 15 sec Pausen und dann bei der n�chsten �bung starten. Insgesamt das in 5 Runden machen"+"\n"+"�bung 1: Burpees"+"\n"+"�bung 2: Jumping Jacks"+"\n"+"�bung 3: Wall climber"+"\n"+"�bung 4: Squads"+"\n"+"�bung 5: Shadow Boxing";
													
	
	public FitnessPlanGenerator(int trainingsTage, String trainingsZiel, String traningsOrt) {
		super();
		this.trainingsTage = trainingsTage;
		this.trainingsZiel = trainingsZiel;
		this.trainingsOrt = traningsOrt;
	}
	
	public String getGkGym() {
		return gkGym;
	}



	public void setGkGym(String gkGym) {
		this.gkGym = gkGym;
	}



	public String getGkHome() {
		return gkHome;
	}



	public void setGkHome(String gkHome) {
		this.gkHome = gkHome;
	}



	public String getOkGym() {
		return okGym;
	}



	public void setOkGym(String okGym) {
		this.okGym = okGym;
	}



	public String getOkHome() {
		return okHome;
	}



	public void setOkHome(String okHome) {
		this.okHome = okHome;
	}



	public String getLgGym() {
		return lgGym;
	}



	public void setLgGym(String lgGym) {
		this.lgGym = lgGym;
	}



	public String getLgHome() {
		return lgHome;
	}



	public void setLgHome(String lgHome) {
		this.lgHome = lgHome;
	}



	public String getPushdayGym() {
		return pushdayGym;
	}



	public void setPushdayGym(String pushdayGym) {
		this.pushdayGym = pushdayGym;
	}



	public String getPushdayHome() {
		return pushdayHome;
	}



	public void setPushdayHome(String pushdayHome) {
		this.pushdayHome = pushdayHome;
	}



	public String getPulldayGym() {
		return pulldayGym;
	}



	public void setPulldayGym(String pulldayGym) {
		this.pulldayGym = pulldayGym;
	}



	public String getPulldayHome() {
		return pulldayHome;
	}



	public void setPulldayHome(String pulldayHome) {
		this.pulldayHome = pulldayHome;
	}



	public String getCardio() {
		return cardio;
	}



	public void setCardio(String cardio) {
		this.cardio = cardio;
	}



	public void bSpeichern_ActionPerformed(ActionEvent evt) {
	    int trainingsTage = Integer.parseInt(EGTrainingstage.getText());
	    String trainingsZiel = EGTrainingsziel.getText();
	    String trainingsOrt = EGTrainingsort.getText();
	    FitnessPlanGenerator p1 = new FitnessPlanGenerator(trainingsTage, trainingsZiel, trainingsOrt);
	}
	
	public void bErstellen_ActionPerformed(ActionEvent evt) {
		String text = "";
		String text2 = "";
		String text3 = "";
		String text4 = "";
		String text5 = "";
		String text6 = "";
		String text7 = "";
		String text8 = "";
		String text9 = "";
		String text10 = "";
		String text11 = "";
		String text12 = "";
		
		if(trainingsTage == 1 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Ganzk�rper Training:";
			text2 = getGkGym();
		}
		if(trainingsTage == 2 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Oberk�rper Training:";
			text2 = getOkGym();
			text3 = "Tag 2 Unterk�rper Training:";
			text4 = getLgGym();
			
		}
		if(trainingsTage == 3 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Push Day:";
			text2 = getPushdayGym();
			text3 = "Tag 2 Pull Day:";
			text4 = getPulldayGym();
			text5 = "Tag 3 Leg Day:";
			text6 = getLgGym();
		}
		if(trainingsTage == 4 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Push Day:";
			text2 = getPushdayGym();
			text3 = "Tag 2 Pull Day:";
			text4 = getPulldayGym();
			text5 = "Tag 3 Leg Day:";
			text6 = getLgGym();
			text7 = "Tag 4 Ganzk�rper Training:";
			text8 = getGkGym();
		}
		if(trainingsTage == 5 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Leg Day:";
			text2 = getLgGym();
			text3 = "Tag 2 Pull Day:";
			text4 = getPulldayGym();
			text5 = "Tag 3 Push Day:";
			text6 = getPushdayGym();
			text7 = "Tag 4 Oberk�rper Training:";
			text8 = getOkGym();
			text9 = "Tag 5 Unterk�rper Training:";
			text10 = getLgGym();
		}
		if(trainingsTage == 6 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Push Day:";
			text2 = getPushdayGym();
			text3 = "Tag 2 Pull Day:";
			text4 = getPulldayGym();
			text5 = "Tag 3 Leg Day:";
			text6 = getLgGym();
			text7 = "Tag 4 Push Day:";
			text8 = getPushdayGym();
			text9 = "Tag 5 Pull Day:";
			text10 = getPulldayGym();
			text11 = "Tag 6 Leg Day:";
			text12 = getLgGym();
		}
		if(trainingsTage == 1 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Cardio:";
			text2 = getCardio();
		}
		if(trainingsTage == 2 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Ganzk�rper Training:";
			text2 = getGkGym();
			text3 = "Tag 2 Cardio:";
			text4 = getCardio();
		}
		if(trainingsTage == 3 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Cardio:";
			text2 = getCardio();
			text3 = "Tag 2 Ganzk�rper Training:";
			text4 = getPulldayGym();
			text5 = "Tag 3 Cardio:";
			text6 = getCardio();
		}
		if(trainingsTage == 4 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Oberk�rper Training:";
			text2 = getOkGym();
			text3 = "Tag 2 Cardio:";
			text4 = getCardio();
			text5 = "Tag 3 Unterk�rper Training:";
			text6 = getLgGym();
			text7 = "Tag 4 Cardio:";
			text8 = getCardio();
		}
		if(trainingsTage == 5 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Push Day:";
			text2 = getPushdayGym();
			text3 = "Tag 2 Cardio:";
			text4 = getCardio();
			text5 = "Tag 3 Pull Day:";
			text6 = getPulldayGym();
			text7 = "Tag 4 Carido:";
			text8 = getCardio();
			text9 = "Tag 5 Leg Day:";
			text10 = getLgGym();
		}
		if(trainingsTage == 6 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Push Day:";
			text2 = getPushdayGym();
			text3 = "Tag 2 Cardio:";
			text4 = getCardio();
			text5 = "Tag 3 Pull Day:";
			text6 = getPulldayGym();
			text7 = "Tag 4 Cardio:";
			text8 = getCardio();
			text9 = "Tag 5 Leg Day:";
			text10 = getLgGym();
			text11 = "Tag 6 Cardio:";
			text12 = getCardio();
		}
		if(trainingsTage == 1 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Ganzk�rper Training:";
			text2 = getGkHome();
		}
		if(trainingsTage == 2 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Oberk�rper Training:";
			text2 = getOkHome();
			text3 = "Tag 2 Unterk�rper Training:";
			text4 = getLgHome();
		}
		if(trainingsTage == 3 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Push Day:";
			text2 = getPushdayHome();
			text3 = "Tag 2 Pull Day:";
			text4 = getPulldayHome();
			text5 = "Tag 3 Leg Day:";
			text6 = getLgHome();
		}
		if(trainingsTage == 4 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Push Day:";
			text2 = getPushdayHome();
			text3 = "Tag 2 Pull Day:";
			text4 = getPulldayHome();
			text5 = "Tag 3 Leg Day:";
			text6 = getLgHome();
			text7 = "Tag 4 Ganzk�rper Training:";
			text8 = getGkHome();
		}
		if(trainingsTage == 5 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Leg Day:";
			text2 = getLgHome();
			text3 = "Tag 2 Pull Day:";
			text4 = getPulldayHome();
			text5 = "Tag 3 Push Day:";
			text6 = getPushdayHome();
			text7 = "Tag 4 Oberk�rper Training:";
			text8 = getOkHome();
			text9 = "Tag 5 Unterk�rper Training:";
			text10 = getLgHome();
		}
		if(trainingsTage == 6 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Push Day:";
			text2 = getPushdayHome();
			text3 = "Tag 2 Pull Day:";
			text4 = getPulldayHome();
			text5 = "Tag 3 Leg Day:";
			text6 = getLgHome();
			text7 = "Tag 4 Push Day:";
			text8 = getPushdayHome();
			text9 = "Tag 5 Pull Day:";
			text10 = getPulldayHome();
			text11 = "Tag 6 Leg Day:";
			text12 = getLgHome();
		}
		if(trainingsTage == 1 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Cardio:";
			text2 = getCardio();
		}
		if(trainingsTage == 2 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Ganzk�rper Training:";
			text2 = getGkHome();
			text3 = "Tag 2 Cardio:";
			text4 = getCardio();
		}
		if(trainingsTage == 3 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Cardio:";
			text2 = getCardio();
			text3 = "Tag 2 Ganzk�rper Training:";
			text4 = getPulldayHome();
			text5 = "Tag 3 Cardio:";
			text6 = getCardio();
		}
		if(trainingsTage == 4 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Oberk�rper Training:";
			text2 = getOkHome();
			text3 = "Tag 2 Cardio:";
			text4 = getCardio();
			text5 = "Tag 3 Unterk�rper Training:";
			text6 = getLgHome();
			text7 = "Tag 4 Cardio:";
			text8 = getCardio();
		}
		if(trainingsTage == 5 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Push Day:";
			text2 = getPushdayHome();
			text3 = "Tag 2 Cardio:";
			text4 = getCardio();
			text5 = "Tag 3 Pull Day:";
			text6 = getPulldayHome();
			text7 = "Tag 4 Carido:";
			text8 = getCardio();
			text9 = "Tag 5 Leg Day:";
			text10 = getLgHome();
		}
		if(trainingsTage == 6 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Push Day:";
			text2 = getPushdayHome();
			text3 = "Tag 2 Cardio:";
			text4 = getCardio();
			text5 = "Tag 3 Pull Day:";
			text6 = getPulldayHome();
			text7 = "Tag 4 Cardio:";
			text8 = getCardio();
			text9 = "Tag 5 Leg Day:";
			text10 = getLgHome();
			text11 = "Tag 6 Cardio:";
			text12 = getCardio();
		}
		
		
		AGtrainingsplan.setText(text+"\n"+text2+"\n"+text3+"\n"+text4+"\n"+text5+"\n"+text6+"\n"+text7+"\n"+text8+"\n"+text9+"\n"+text10+"\n"+text11+"\n"+text12);
		
	  }

	public static void main(String[] args) {
		Trainingsplan t1 = new Trainingsplan(1, "Muskelaufbau","Gym");
	
		
		
	}
}

