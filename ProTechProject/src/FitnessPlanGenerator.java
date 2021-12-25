import java.awt.event.ActionEvent;

public class FitnessPlanGenerator extends GUITG {
	
	
	
	protected static int trainingsTage;
	protected static String trainingsZiel;
	protected static String trainingsOrt;
	private String gkGym = "Übung 1: Flachbankdrücken Maschine, Sätze: 3, Wiederholungen: 10" + "\n" + "Übung 2: Butterfly, Sätze: 3, Wiederholungen: 10" +"\n" + "Übung 3: Latzug zur Brust, Sätze: 3, Wiederholungen: 10" + "\n" + "Übung 4: Rudern am Kabel sitzend, Sätze: 3, Wiederholungen: 10" + "\n" + "Übung 5: Seitheben Kurzhanteln, Sätze: 3, Wiederholungen: 10" + "\n" + "Übung 6: SZ Curls, Sätze: 3, Wiederholungen: 10" + "\n"+"Übung 7: Trizepsdrücken am Kabel, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 8: Beinpresse, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 9: Beincurls, Sätze: 3, Wiederholungen: 10"+ "\n"+"Übung 10: Crunch, Sätze: 3, Wiederholungen: 10"  ;
	private String gkHome = "Übung 1: Liegestütze Sätze: 3, Wiederholungen: 5 - 15" + "\n"+"Übung 2: Squads ohne Gewicht , Sätze: 3, Wiederholungen: 10 - 25"+"\n"+"Übung 3: Rudern an der Tischkante, Sätze: 3, Wiederholungen: 5 - 12"+"\n"+"Übung 4: Wandsitzen (Beine 90°) , Sätze: 3, Wiederholungen: 30 - 50 sec"+"\n"+"Übung 5: Crunches, Sätze: 3, Wiederholungen: 10 - 30";
	private String okGym =	"Übung 1: Bankdrücken, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 2: Dips, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 3: Push ups, Sätze: 3, Wiederholungen: MAX"+"\n"+"Übung 4: Rudern(Maschine oder Kabel), Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 5: Military Press, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 6: Seitheben, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 7: SZ-Curls, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 8: Pushdowns, Sätze: 3, Wiederholungen: 10";
	private String okHome =	"Übung 1: breite Liegestütze, Sätze: 3, Wiederholungen: 10 - 15"+"\n"+"Übung 2: enge Liegestütze, Sätze: 3, Wiederholungen: 10 - 15"+"\n"+"Übung 3: Kopfüber Schulterdrücken, Sätze: 3, Wiederholungen: 10 - 15"+"\n"+"Übung 4: Dips, Sätze: 3, Wiederholungen: 10 - 15"+"\n"+"Übung 5: Crunches, Sätze: 3, Wiederholungen: 10 - 20";
	private String lgGym ="Übung 1: Kreuzheben, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 2: Beinpresse, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 3: Ausfallschritte mit Gewichten, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 4: Wandenheben am Gerät, Sätze: 3, Wiederholungen: 10";
	private String lgHome ="Übung 1: Squats, Sätze: 3, Wiederholungen: 10 - 30"+"\n"+"Übung 2: Slow Walk, Sätze: 3, Wiederholungen: 30 - 45 sec"+"\n"+"Übung 3: Ausfallschritte, Sätze: 3, Wiederholungen: 10 - 15"+"\n"+"Übung 4: Wandenheben am Gerät, Sätze: 3, Wiederholungen: 10 - 35";
	private String pushdayGym ="Übung 1: Bankdrücken mit LH, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 2: Schrägbankdrücken mit KH, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 3: Butterfly, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 4: Seitheben mit KH, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 5: enges Bankdrücken mit SZ-Stange, Sätze: 3, Wiederholungen: 10";
	private String pushdayHome ="Übung 1: Breite Liegestütze, Sätze: 3, Wiederholungen: MAX"+"\n"+"Übung 2: Dips, Sätze: 3, Wiederholungen: MAX"+"\n"+"Übung 3: Überkopf Schulterdrücken, Sätze: 3, Wiederholungen: MAX"+"\n"+"Übung 4: enge Liegestütze, Sätze: 3, Wiederholungen: MAX"+"\n"+"Übung 5: Butterfly ohne Gewicht, Sätze: 3, Wiederholungen: 10 - 20";
	private String pulldayGym ="Übung 1: Push ups, Sätze: 3, Wiederholungen: MAX"+"\n"+"Übung 2: Enges Kabelrudern, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 3: Rudermaschine, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 4: Butterfly Reverse, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 5: Langhantelcurls, Sätze: 3, Wiederholungen: 10";
	private String pulldayHome ="Übung 1: Push ups, Sätze: 3, Wiederholungen: MAX"+"\n"+"Übung 2: Pull ups, Sätze: 3, Wiederholungen: MAX"+"\n"+"Übung 3: Rudern an Tischkante, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 4: Butterfly Reverse gegen Schwerkraft, Sätze: 3, Wiederholungen: 10"+"\n"+"Übung 5: Curls mit eigenen Wiederstand, Sätze: 3, Wiederholungen: 10";
	private String cardio = "Jede Übung 45 sec ausführen danach 15 sec Pausen und dann bei der nächsten Übung starten. Insgesamt das in 5 Runden machen"+"\n"+"Übung 1: Burpees"+"\n"+"Übung 2: Jumping Jacks"+"\n"+"Übung 3: Wall climber"+"\n"+"Übung 4: Squads"+"\n"+"Übung 5: Shadow Boxing";
													
	
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
			text = "Tag 1 Ganzkörper Training:";
			text2 = getGkGym();
		}
		if(trainingsTage == 2 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Oberkörper Training:";
			text2 = getOkGym();
			text3 = "Tag 2 Unterkörper Training:";
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
			text7 = "Tag 4 Ganzkörper Training:";
			text8 = getGkGym();
		}
		if(trainingsTage == 5 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Leg Day:";
			text2 = getLgGym();
			text3 = "Tag 2 Pull Day:";
			text4 = getPulldayGym();
			text5 = "Tag 3 Push Day:";
			text6 = getPushdayGym();
			text7 = "Tag 4 Oberkörper Training:";
			text8 = getOkGym();
			text9 = "Tag 5 Unterkörper Training:";
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
			text = "Tag 1 Ganzkörper Training:";
			text2 = getGkGym();
			text3 = "Tag 2 Cardio:";
			text4 = getCardio();
		}
		if(trainingsTage == 3 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Cardio:";
			text2 = getCardio();
			text3 = "Tag 2 Ganzkörper Training:";
			text4 = getPulldayGym();
			text5 = "Tag 3 Cardio:";
			text6 = getCardio();
		}
		if(trainingsTage == 4 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Gym")) {
			text = "Tag 1 Oberkörper Training:";
			text2 = getOkGym();
			text3 = "Tag 2 Cardio:";
			text4 = getCardio();
			text5 = "Tag 3 Unterkörper Training:";
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
			text = "Tag 1 Ganzkörper Training:";
			text2 = getGkHome();
		}
		if(trainingsTage == 2 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Oberkörper Training:";
			text2 = getOkHome();
			text3 = "Tag 2 Unterkörper Training:";
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
			text7 = "Tag 4 Ganzkörper Training:";
			text8 = getGkHome();
		}
		if(trainingsTage == 5 && trainingsZiel.equals("Muskelaufbau") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Leg Day:";
			text2 = getLgHome();
			text3 = "Tag 2 Pull Day:";
			text4 = getPulldayHome();
			text5 = "Tag 3 Push Day:";
			text6 = getPushdayHome();
			text7 = "Tag 4 Oberkörper Training:";
			text8 = getOkHome();
			text9 = "Tag 5 Unterkörper Training:";
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
			text = "Tag 1 Ganzkörper Training:";
			text2 = getGkHome();
			text3 = "Tag 2 Cardio:";
			text4 = getCardio();
		}
		if(trainingsTage == 3 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Cardio:";
			text2 = getCardio();
			text3 = "Tag 2 Ganzkörper Training:";
			text4 = getPulldayHome();
			text5 = "Tag 3 Cardio:";
			text6 = getCardio();
		}
		if(trainingsTage == 4 && trainingsZiel.equals("Abnehmen") && trainingsOrt.equals("Home")) {
			text = "Tag 1 Oberkörper Training:";
			text2 = getOkHome();
			text3 = "Tag 2 Cardio:";
			text4 = getCardio();
			text5 = "Tag 3 Unterkörper Training:";
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

