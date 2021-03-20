
public class ThirdKap extends Kapitel {

	public ThirdKap(boolean s) {
		super(s);
		Inhalt i= new Inhalt("Komponenten von TCP Socket","Komponenten TCP Socket","T");
        i.addAnswer("Quell-IP-Adresse");
        i.addAnswer("Quell-Port");
        i.addAnswer("Ziel-IP-Adresse");
        i.addAnswer("Ziel-Port");
        addInhalt(i);
        /////Demultiplexing ?
        Inhalt i1= new Inhalt("Demultiplexing bei UDP","Demultiplexing bei UDP","T");
        i1.addAnswer("Demultiplexing nutzt nur die Portnummer des Empf�ngers");
        i1.addWrong("Demultiplexing nutzt ein  4 Tupel: Quell und Ziel IP Adresse und beide Portnummern");
        i1.addWrong("jede Socket ist einem Process zugeordnet");
        i1.addAnswer("ein Socket f�r alle Processe");
        addInhalt(i1);
        Inhalt i2= new Inhalt("Demultiplexing bei TCP","Demultiplexing bei TCP","T");
        i2.addWrong("Demultiplexing nutzt nur die Portnummer des Empf�ngers");
        i2.addAnswer("Demultiplexing nutzt ein  4 Tupel: Quell und Ziel IP Adresse und beide Portnummern");
        i2.addAnswer("jede Socket ist einem Process zugeordnet");
        i2.addWrong("ein Socket f�r alle Processe");
        addInhalt(i2);
        Inhalt i3 = new Inhalt("UDP","UDP","T");
        i3.addAnswer("User Datagram Protocol");
        i3.addAnswer("RFC 768");
        i3.addAnswer("einfaches Protokoll, wenig Overhead");
        i3.addAnswer("Demultiplexing nutzt nur die Portnummer des Empf�ngers");
        i3.addAnswer("Services best effort");
        i3.addAnswer("keine Ueberlast oder Flusskontrolle");
        i3.addAnswer("keine Garantien (Verlust, Reihenfolge, ...)");
        i3.addAnswer("Multimedia Streaming, DNS, SNMP, HTTP 3");
        i3.addAnswer("Verbesserung des Services auf der Anwendungsschicht, falls n�tig");
        addInhalt(i3);
        Inhalt i4 = new Inhalt("UDP-Segment","UDP Segment","T");
        i4.addAnswer("Laenge 32 Bit");
        i4.addAnswer("1.Quellportnummer");
        i4.addAnswer("2.Zielportnummer");
        i4.addAnswer("3.Laenge");
        i4.addAnswer("4.Pr�fsumme");
        i4.addAnswer("Header besitzt 4 Elemente");
        i4.addAnswer("Inhalt: T-Nutzdaten");
        i4.addWrong("1.Laenge");
        i4.addWrong("2.Pr�fsumme");
        i4.addWrong("4.Quellportnummer");
        i4.addWrong("3.Zielportnummer");
        i4.addWrong("Header besitzt 2 Elemente");
        i4.addWrong("Lange 64 Bit");
        addInhalt(i4);
        Inhalt i5= new Inhalt("Internet Pr�fsumme bei UDP (Pruefsumme �ber)","Internet Pr�fsumme bei UDP","T");
        i5.addAnswer("alle realen Headerfelder (Source-,Destination-Port, Length)");
        i5.addAnswer("Pseudo-Headerfelder(IP-Source, Destination-Address,...)");
        i5.addAnswer("Datenfeld");
        i5.addWrong("alle Headerfelder(Source-,Destination-Port, Sequence-,Ack-Number,....,Options)");
        i5.addWrong("alle Headerfelder (Version,IHL,....,Source-,Destination-Address,...,Options)");
        addInhalt(i5);
        Inhalt i6= new Inhalt("Internet Pr�fsumme bei TCP (Pruefsumme �ber)","Internet Pr�fsumme bei TCP","T");
        i6.addWrong("alle realen Headerfelder (Source-,Destination-Port, Length)");
        i6.addAnswer("Pseudo-Headerfelder(IP-Source, Destination-Address,...)");
        i6.addAnswer("Datenfeld");
        i6.addAnswer("alle Headerfelder(Source-,Destination-Port, Sequence-,Ack-Number,....,Options)");
        i6.addWrong("alle Headerfelder (Version,IHL,....,Source-,Destination-Address,...,Options)");
        addInhalt(i6);
        Inhalt i7= new Inhalt("Internet Pr�fsumme bei IP Datagramme (Pruefsumme �ber)","Internet Pr�fsumme bei IP Datagramme","T");
        i7.addWrong("alle realen Headerfelder (Source-,Destination-Port, Length)");
        i7.addWrong("Pseudo-Headerfelder(IP-Source, Destination-Address,...)");
        i7.addWrong("Datenfeld");
        i7.addWrong("alle Headerfelder(Source-,Destination-Port, Sequence-,Ack-Number,....,Options)");
        i7.addAnswer("alle Headerfelder (Version,IHL,....,Source-,Destination-Address,...,Options)");
        addInhalt(i7);
        Inhalt i8=new Inhalt("Mechanismen zur Unterst�tzung zuverl�ssiger �bertragungen","Mechanismen zur Unterst�tzung zuverl�ssiger �bertragungen","T");
        i8.addAnswer("Pr�fsummen: Fehlererkennung");
        i8.addAnswer("Timer: Verluste, aber doppelte �bertragungen m�glich");
        i8.addAnswer("Sequenznummern: Erkannt Luecken im Packetstrom und doppelte �bertragungen");
        i8.addAnswer("ACKs: Best�tigung des korrekten Empfangs unter Nutzung der Sequenznummer");
        i8.addAnswer("NAK: Empf�nger teilt Sender mit, dass bestimmtes Packet nicht korrekt empfangen wurde, alternativ: ausbleibendes ACK+ Timeout");
        i8.addAnswer("Fenster, Pipelining: Effizienzsteigerung und Flusskontrolle");
        i8.addWrong("Pr�fsummen: Verluste, aber doppelte �bertragungen m�glich");
        i8.addWrong("Sequenznummern: Fehlererkennung");
        i8.addWrong("Fenster, Pipelining: Erkannt Luecken im Packetstrom und doppelte �bertragungen");
        i8.addWrong("Timer: Fehlererkennung");
        i8.addWrong("Sequenznummern: Best�tigung des korrekten Empfangs unter Nutzung der Sequenznummer");
        addInhalt(i8);
        Inhalt i9= new Inhalt("rdt 1.0","rdt 1.0","T");
        i9.addAnswer("Zuverl�ssiger Basisdienst");
        i9.addWrong("Basisdienst nicht Verf�lschungsfrei (Bitfehler)");
        i9.addWrong("Verf�lschungsbehandlung : ARQ (Automatic Repeat Request) , FEC (Forward Error Correction)");
        i9.addWrong("Stop and Wait Protokoll: Sende Nachricht dann warte auf Quittung (ACK/NAK)");
        i9.addWrong("nutzt Sequenzzahlen zu behandeln von Doppel�bertragungen wenn ACK/NAK fehlerhaft");
        i9.addWrong("Stop and Wait ohne NAK, sendet der Empf�nger ein ACK f�r das letzte fehlerfrei empfangene Packet, Sender reagiert auf doppelte ACKs wie NAK -> erneutes Senden das aktuellen Pakets");
        i9.addWrong("Basisdienst nicht Verf�lschungsfrei (Bitfehler) und Verlustbehaftet");
        i9.addWrong("Time-Out Mechanismus : beim Senden einer Nachricht Kurzzeitweckerstarten, Weckeralarm wie NAK behandeln -> �bertragung wiederholen");
        addInhalt(i9);
        Inhalt i10= new Inhalt("rdt 2.0","rdt 2.0","T");
        i10.addWrong("Zuverl�ssiger Basisdienst");
        i10.addAnswer("Basisdienst nicht Verf�lschungsfrei (Bitfehler)");
        i10.addAnswer("Verf�lschungsbehandlung : ARQ (Automatic Repeat Request) , FEC (Forward Error Correction)");
        i10.addAnswer("Stop and Wait Protokoll: Sende Nachricht dann warte auf Quittung (ACK/NAK)");
        i10.addAnswer("ACK/NAK Fehler nicht erkennbar");
        i10.addWrong("nutzt Sequenzzahlen zu behandeln von Doppel�bertragungen wenn ACK/NAK fehlerhaft");
        i10.addWrong("Stop and Wait ohne NAK, sendet der Empf�nger ein ACK f�r das letzte fehlerfrei empfangene Packet, Sender reagiert auf doppelte ACKs wie NAK -> erneutes Senden das aktuellen Pakets");
        i10.addWrong("Basisdienst nicht Verf�lschungsfrei (Bitfehler) und Verlustbehaftet");
        i10.addWrong("Time-Out Mechanismus : beim Senden einer Nachricht Kurzzeitweckerstarten, Weckeralarm wie NAK behandeln -> �bertragung wiederholen");
        addInhalt(i10);
        Inhalt i11= new Inhalt("rdt 2.1","rdt 2.1","T");
        i11.addWrong("Zuverl�ssiger Basisdienst");
        i11.addWrong("ACK/NAK Fehler nicht erkennbar");
        i11.addAnswer("Basisdienst nicht Verf�lschungsfrei (Bitfehler)");
        i11.addAnswer("Verf�lschungsbehandlung : ARQ (Automatic Repeat Request) , FEC (Forward Error Correction)");
        i11.addAnswer("Stop and Wait Protokoll: Sende Nachricht dann warte auf Quittung (ACK/NAK)");
        i11.addAnswer("nutzt Sequenzzahlen zu behandeln von Doppel�bertragungen wenn ACK/NAK fehlerhaft");
        i11.addWrong("Stop and Wait ohne NAK, sendet der Empf�nger ein ACK f�r das letzte fehlerfrei empfangene Packet, Sender reagiert auf doppelte ACKs wie NAK -> erneutes Senden das aktuellen Pakets");
        i11.addWrong("Basisdienst nicht Verf�lschungsfrei (Bitfehler) und Verlustbehaftet");
        i11.addWrong("Time-Out Mechanismus : beim Senden einer Nachricht Kurzzeitweckerstarten, Weckeralarm wie NAK behandeln -> �bertragung wiederholen");
        addInhalt(i11);
        Inhalt i12= new Inhalt("rdt 2.2","rdt 2.2","T");
        i12.addWrong("Zuverl�ssiger Basisdienst");
        i12.addWrong("ACK/NAK Fehler nicht erkennbar");
        i12.addAnswer("Basisdienst nicht Verf�lschungsfrei (Bitfehler)");
        i12.addAnswer("Verf�lschungsbehandlung : ARQ (Automatic Repeat Request) , FEC (Forward Error Correction)");
        i12.addWrong("Stop and Wait Protokoll: Sende Nachricht dann warte auf Quittung (ACK/NAK)");
        i12.addAnswer("nutzt Sequenzzahlen zu behandeln von Doppel�bertragungen wenn ACK/NAK fehlerhaft");
        i12.addAnswer("Stop and Wait ohne NAK, sendet der Empf�nger ein ACK f�r das letzte fehlerfrei empfangene Packet, Sender reagiert auf doppelte ACKs wie NAK -> erneutes Senden das aktuellen Pakets");
        i12.addWrong("Basisdienst nicht Verf�lschungsfrei (Bitfehler) und Verlustbehaftet");
        i12.addWrong("Time-Out Mechanismus : beim Senden einer Nachricht Kurzzeitweckerstarten, Weckeralarm wie NAK behandeln -> �bertragung wiederholen");
        addInhalt(i12);
        Inhalt i13= new Inhalt("rdt 3.0","rdt 3.0","T");
        i13.addWrong("Zuverl�ssiger Basisdienst");
        i13.addWrong("ACK/NAK Fehler nicht erkennbar");
        i13.addWrong("Basisdienst nicht Verf�lschungsfrei (Bitfehler)");
        i13.addAnswer("Verf�lschungsbehandlung : ARQ (Automatic Repeat Request) , FEC (Forward Error Correction)");
        i13.addWrong("Stop and Wait Protokoll: Sende Nachricht dann warte auf Quittung (ACK/NAK)");
        i13.addAnswer("nutzt Sequenzzahlen zu behandeln von Doppel�bertragungen wenn ACK/NAK fehlerhaft");
        i13.addAnswer("Stop and Wait ohne NAK, sendet der Empf�nger ein ACK f�r das letzte fehlerfrei empfangene Packet, Sender reagiert auf doppelte ACKs wie NAK -> erneutes Senden das aktuellen Pakets");
        i13.addAnswer("Basisdienst nicht Verf�lschungsfrei (Bitfehler) und Verlustbehaftet");
        i13.addAnswer("Time-Out Mechanismus : beim Senden einer Nachricht Kurzzeitweckerstarten, Weckeralarm wie NAK behandeln -> �bertragung wiederholen");
        addInhalt(i13);
        Inhalt i14= new Inhalt("Pipellining Protokoll Go back n","Go back n","T");
        i14.addAnswer("Fenstergro�e N");
        i14.addAnswer("ACK f�r Packet n best�tigt alle Pakete die bis zu Paket n gesendet wurden");
        i14.addAnswer("Sender setzt Timer f�r das �lteste nicht best�tigte Paket, Eintreffen eines ACKs Timer neu gestartet ,sofern noch nicht alle ACKs eingetroffen");
        i14.addAnswer("Timerablauf Wiederholung aller noch nicht best�tigten Paketen");
        i14.addAnswer("Empf�nger sendet ACK f�r das das korrekt empfangene Paket mit der gr��ten Sequenznummer , Pakete in falscher Reihenfolge wegwerfen ");
        i14.addWrong("Empf�nger best�tigt jedes korrekt empfangene Paket, puffert Pakete, die in falscher Reihenfolge empfangen wurden aber deren Sequenznummer in Fenster liegen");
        i14.addWrong("Sender sendet nur unbest�tigte Pakete erneut, Startet Timer fur dieses Paket neu");
        i14.addWrong("Sender setzt ein Timer fuer jedes Paket");
        i14.addWrong("Sender markiert best�tigte Pakete");
        i14.addAnswer("Sender sendet Paket, wenn n�chste Sequenznummer im Fenster liegt");
        i14.addWrong("Fenster bei Sender wird verschiebt, wenn Paket mit kleinster Sequenznummer best�tigt wird");
        i14.addAnswer("Empf�nger ignoriert Pakete deren Sequenznummer nicht in Fenster liegen");
        i14.addWrong("Empf�anger liefert buffered Pakete , nachdem alle Pakete in richtige Reihenfolge empfangen wurden");
        addInhalt(i14);
        Inhalt i15= new Inhalt("Pipellining Protokoll Selective Repeat","Selective Repeat","T");
        i15.addAnswer("Fenstergro�e N");
        i15.addWrong("ACK f�r Packet n best�tigt alle Pakete die bis zu Paket n gesendet wurden");
        i15.addWrong("Sender setzt Timer f�r das �lteste nicht best�tigte Paket, Eintreffen eines ACKs Timer neu gestartet ,sofern noch nicht alle ACKs eingetroffen");
        i15.addWrong("Timerablauf Wiederholung aller noch nicht best�tigten Paketen");
        i15.addWrong("Empf�nger sendet ACK f�r das das korrekt empfangene Paket mit der gr��ten Sequenznummer , Pakete in falscher Reihenfolge wegwerfen ");
        i15.addAnswer("Empf�nger best�tigt jedes korrekt empfangene Paket, puffert Pakete, die in falscher Reihenfolge empfangen wurden aber deren Sequenznummer in Fenster liegen");
        i15.addAnswer("Sender sendet nur unbest�tigte Pakete erneut, Startet Timer fur dieses Paket neu");
        i15.addAnswer("Sender setzt ein Timer fuer jedes Paket");
        i15.addAnswer("Sender markiert best�tigte Pakete");
        i15.addAnswer("Sender sendet Paket, wenn n�chste Sequenznummer im Fenster liegt");
        i15.addAnswer("Fenster bei Sender wird verschiebt, wenn Paket mit kleinster Sequenznummer best�tigt wird");
        i15.addAnswer("Empf�nger ignoriert Pakete deren Sequenznummer nicht in Fenster liegen");
        i15.addAnswer("Empf�anger liefert buffered Pakete , nachdem alle Pakete in richtige Reihenfolge empfangen wurden");
        addInhalt(i15);
        Inhalt i16= new Inhalt("SampleRTT","SampleRTT","T");
        i16.addAnswer("Zeitspane von Absenden eines Segments bis zum Empfang des ACKs (ohne Ber�cksichtigung von Wiederholungen)");
        i16.addWrong("Zeitspane von Absenden eines Segments bis zum Empfang des ACKs (Wiederholungen ber�cksichtigt)");
        addInhalt(i16);
        Inhalt i17= new Inhalt("TimeOut bei TCP","TimeOut TCP","T");
        i17.addAnswer("=RTT+Sicherheitsabstand");
        i17.addAnswer("RTT f�r TimeOut : = EstimatedRTT*Faktor( Faktor = 2 bis 4)");
        i17.addWrong("RTT f�r TimeOut : = EstimatedRTT");
        i17.addWrong("=RTT");
        i17.addWrong("=(1- alpha)*EstimatedRTT+alpha*SampleRTT mit  typischem Wert f�r alpha = 0.125");
        addInhalt(i17);
        Inhalt i18= new Inhalt("EstimatedRTT","EstimatedRTT","T");
        i18.addAnswer("=(1- alpha)*EstimatedRTT+alpha*SampleRTT mit  typischem Wert f�r alpha = 0.125");
        i18.addWrong("=RTT+Sicherheitsabstand");
        i18.addWrong("=EstimatedRTT+alpha*SampleRTT mit  typischem Wert f�r alpha = 0.125");
        addInhalt(i18);
        Inhalt i19= new Inhalt("Ankunft eines Segments mit der erwarteten Seq.Nr., alle vorher empfangenen Daten wurden bereits best�tigt","ereignis beim empfanger bei tcp 1","");
        i19.addAnswer("Warte bis zu 500ms auf ein neues zu sendendes Segment. Falls kein Segment kommt sende ACK");
        i19.addWrong("Best�tigte alle noch nicht best�tigten Segmente sofort");
        i19.addWrong("Sende sofort ein duplicate ACK mit der n�chsten erwarteten Seq.Nr");
        i19.addWrong("Falls das Seg,emnt zu Beginn der L�cke startet, sende sofort ein ACK");
        addInhalt(i19);
        Inhalt i20= new Inhalt("Ankunft eines Segments mit der erwarteten Seq.Nr., vorher empfangenen Daten wurden noch nicht best�tigt","ereignis beim empfanger bei tcp 2","");
        i20.addWrong("Warte bis zu 500ms auf ein neues zu sendendes Segment. Falls kein Segment kommt sende ACK");
        i20.addAnswer("Best�tigte alle noch nicht best�tigten Segmente sofort");
        i20.addWrong("Sende sofort ein duplicate ACK mit der n�chsten erwarteten Seq.Nr");
        i20.addWrong("Falls das Seg,emnt zu Beginn der L�cke startet, sende sofort ein ACK");
        addInhalt(i20);
        Inhalt i21= new Inhalt("Ankunft eines Segments mit einer zu gro�en Seq.Nr., L�cke entdeckt","ereignis beim empfanger bei tcp 3","");
        i21.addWrong("Warte bis zu 500ms auf ein neues zu sendendes Segment. Falls kein Segment kommt sende ACK");
        i21.addWrong("Best�tigte alle noch nicht best�tigten Segmente sofort");
        i21.addAnswer("Sende sofort ein duplicate ACK mit der n�chsten erwarteten Seq.Nr ");
        i21.addWrong("Falls das Seg,emnt zu Beginn der L�cke startet, sende sofort ein ACK");
        addInhalt(i21);
        Inhalt i22= new Inhalt("Ankunft eines Segments welches eine L�cke f�llt","ereignis beim empfanger bei tcp 4","");
        i22.addWrong("Warte bis zu 500ms auf ein neues zu sendendes Segment. Falls kein Segment kommt sende ACK");
        i22.addWrong("Best�tigte alle noch nicht best�tigten Segmente sofort");
        i22.addWrong("Sende sofort ein duplicate ACK mit der n�chsten erwarteten Seq.Nr");
        i22.addAnswer("Falls das Seg,emnt zu Beginn der L�cke startet, sende sofort ein ACK");
        addInhalt(i22);
        Inhalt i23= new Inhalt("Fast Retransmit","fast retransmit","T");
        i23.addAnswer("Wenn Sender 3 ACKS fuer das selbe Segment empfangen hat, sendet er das nachfolgende Segment von diesem Segment noch einmal , auch wenn der Timer noch nicht abgelaufen ist");
        i23.addWrong("Wenn Sender 3 ACKS fuer das selbe Segment empfangen hat, sendet er das Segment noch einmal , auch wenn der Timer noch nicht abgelaufen ist");
        addInhalt(i23);
        Inhalt i24=new Inhalt("Flusskontrolle bei TCP","Flusskontrolle","T");
        i24.addAnswer("Abstimmung der Senderate mit der Empfangsrate");
        i24.addAnswer("Empf�nger sendet mit jedem Segment den Wert von Window");
        i24.addAnswer("Sender richtet sich mit dem Senden nach LastByteSent - LastByteAcked < = Window");
        addInhalt(i24);
        Inhalt i25=new Inhalt("3 Wege Handshake","3 Wege Handshake","T"); 
        i25.addAnswer("client HOst sendet TCP SYN Segment ohne Daten zum Server, um initiale seq zu spezifizieren");
        i25.addAnswer("server Host empf�ngt SYN, antwortet mit SYNACK , allokiert Pufferplatz, spezifiziert initiale seq");
        i25.addAnswer("Client empf�ngt SYNACK, antwortet mit ACK Segment das Daten enthalten kann");
        i25.addWrong("client HOst sendet TCP SYN Segment zum Server, um initiale seq zu spezifizieren und Daten zu transportieren");
        i25.addWrong("server Host empf�ngt SYN, antwortet mit SYNACK ");
        i25.addWrong("Client empf�ngt SYNACK, antwortet mit ACK Segment ohne Daten");
        addInhalt(i25);
        Inhalt i26 = new Inhalt("TCP close","TCP close","T");
        i26.addAnswer("1. CLient sendet TCP-FIN an Server");
        i26.addAnswer("2. Server empf�ngt FIN, sendet ACK , beendet die Verbindung , sendet ein FIN zur�ck");
        i26.addAnswer("3. CLient emf�ngt FIN, anwortet ACK, geht in Zustand Time wait");
        i26.addAnswer("4. Server empf�ngt ACK, Verbindung endet");
        i26.addWrong("1. Server sendet FIN an CLient");
        i26.addAnswer("2. CLient emf�ngt FIN, anwortet ACK, geht in Zustand Time wait");
        i26.addWrong("3. Server empf�ngt ACK, beendet die Verbindung , sendet ein FIN zur�ck");
        i26.addWrong("4. Client empf�ngt FIN, Verbindung endet");
        addInhalt(i26);
        Inhalt i27= new Inhalt("Ursachen f�r Staus im Internet","Staus im Internet","T");
        i27.addAnswer("unbeschr�nkter Puffer : Gr��ere Verz�gerung im Router w�hrend der �bermittlung bei wachsender �bertragungsrate und wachsendem Hintergrundverkehr -> gr��ere Wartenschlangenverz�gerungen wenn die Paketempfangsrate der Leitungskapazit�t ann�hert ");
        i27.addAnswer("beschr�nkter Puffer : Puffer�berl�ufe -> Segmente verloren -> wiederholte �bertragungen -> zusatzliche Last und Verkehr");
        i27.addAnswer("beschr�nkter Puffer : Gemeinsam genutzte Routen -> Paketverlusten bei allen Verbindungen -> Wiederholungen auf allen Verbindungen"); 
        i27.addWrong("Mehrere gleichzeitige Verbindungen : Gemeinsam genutzte Routen -> Paketverlusten bei allen Verbindungen -> Wiederholungen auf allen Verbindungen");
        i27.addWrong("�bertragung von gr��es Paket : Gr��es Paket -> mehr Resourcen ben�tigt -> gr��ere Verzogerung");
        addInhalt(i27);
        Inhalt i28 = new Inhalt("Ende zu Ende �berlastkontrolle","Ende zu Ende �berlastkontrolle","T");
        i28.addAnswer("keine explizite Unterst�tzung durch die Vermittlungsschicht");
        i28.addAnswer("�berlastung wird durch Paketverlust und verz�gerung festgestellt und kann die Fenstergr��e verkleinern");
        i28.addAnswer("TCP muss diesen Ansatz verfolgen");
        i28.addWrong("Komponenten der Vermittluongsschicht geben dem Sender explizit Information �ber �berlastzust�nde");
        i28.addWrong("zb DECnet, TCP/IP ECN, ATM ABR");
        i28.addWrong("Sender bekommt eine explizite Senderate Zugeteilt");
        addInhalt(i28);
        Inhalt i29 = new Inhalt("�berlastkontrolle im Netz","�berlastkontrolle im Netz","T");
        i29.addWrong("keine explizite Unterst�tzung durch die Vermittlungsschicht");
        i29.addWrong("�berlastung wird durch Paketverlust und verz�gerung festgestellt und kann die Fenstergr��e verkleinern");
        i29.addWrong("TCP muss diesen Ansatz verfolgen");
        i29.addAnswer("Komponenten der Vermittluongsschicht geben dem Sender explizit Information �ber �berlastzust�nde");
        i29.addAnswer("zb DECnet, TCP/IP ECN, ATMABR");
        i29.addAnswer("Sender bekommt eine explizite Senderate Zugeteilt");
        addInhalt(i29);
        Inhalt i30= new Inhalt("ABR","ABR","T");
        i30.addAnswer("Available Bit Rate");
        i30.addAnswer("elastischer Dienst");
        i30.addAnswer("Realisierung durch RM (Resource Management)");
        i30.addAnswer("Pfad vom Sender zum Empf�nger nicht ausgelastet -> Sender soll die verf�gbare Bandbreite nutzen");
        i30.addAnswer("Pfad vom Sender zum Empf�nger ausgelastet -> Sender darf nur minimal garantierte Bandbreite nutzen");
        i30.addWrong("Pfad vom Sender zum Empf�nger nicht ausgelastet -> Sender soll die minimal Bandbreite nutzen");
        i30.addWrong("Pfad vom Sender zum Empf�nger ausgelastet -> Sender soll nicht senden");
        addInhalt(i30);
        Inhalt i31=new Inhalt("RM","RM","T");
        i31.addAnswer("Resource Management");
        i31.addAnswer("Sender sendet RM Zellen zwischen den Datenzellen");
        i31.addAnswer("RM Zellen enthalten Informationen �ber den Netzzustand und werden von Routern gesetzt");
        i31.addAnswer("RM Zellen werden vom Empf�nger zum Sender zur�ckgeschickt");
        i31.addWrong("RM Zellen enthalten Informationen �ber den Sender und werden von Routern gesetzt");
        i31.addWrong("RM Zellen enthalten Informationen �ber die Empf�ngers Fenstergr��e und werden von Sender genutzt");
        i31.addAnswer("NI Bit Rate nicht erh�hen");
        i31.addAnswer("CI Bit �berlast");
        i31.addWrong("NI Bit �berlast");
        i31.addWrong("CI Bit Rate nicht erh�hen");
        addInhalt(i31);
        Inhalt i32= new Inhalt("3 Schritte des Algorithmus zur �berlastkontrolle in TCP","3 Schritte des Algorithmus zur �berlastkontrolle in TCP","T");
        i32.addAnswer("1. Slow Start Phase");
        i32.addAnswer("2. �berlastvermeidung");
        i32.addAnswer("3. Timeout");
        addInhalt(i32);
        Inhalt i33= new Inhalt("Anfangsgr��e von CongWin","Anfangsgr��e von CongWin","T");
        i33.addAnswer("1 MSS");
        i33.addWrong("2 MSS");
        i33.addWrong("3 MSS");
        i33.addWrong("4 MSS");
        addInhalt(i33);
        Inhalt i34= new Inhalt("Slow Start Phase","Slow Start Phase","T");
        i34.addAnswer("bei jedem ACK, das vor Timeout ankommt wird die Gr��e von CongWin um MSS erh�ht");
        i34.addAnswer("Wenn CongWin > Threshold �bergang zu �berlastvermeidung(bei ACK) oder TimeOut(bei Timeout)");
        i34.addWrong("Wenn CongWin >= Threshold �bergang zu �berlastvermeidung(bei ACK) oder TimeOut(bei Timeout)");
        i34.addWrong("bei jedem ACK, das vor Timeout ankommt wird die Gr��e von CongWin um CongWin erh�ht");
        i34.addWrong("bei jedem ACK wird die Gr��e von CongWin um CongWin erh�ht");
        i34.addWrong("bei jedem ACK wird die Gr��e von CongWin um MSS erh�ht");
        addInhalt(i34);
        Inhalt i35=new Inhalt("�berlastvermeidung","�berlastvermeidung","T");
        i35.addAnswer("sobald die Gr��e von CongWin den Grenzwert �bersteigt, wird die Gr��e jeweils nur um MSS/CongWin erh�ht");
        i35.addWrong("sobald die Gr��e von CongWin den Grenzwert �bersteigt, wird die Gr��e jeweils nur um CongWin erh�ht");
        i35.addWrong("sobald die Gr��e von CongWin den Grenzwert �bersteigt, wird die Gr��e jeweils nur um 1/2 MSS erh�ht");
        addInhalt(i35);
        Inhalt i36= new Inhalt("TimeOut","TimeOut","T");
        i36.addAnswer("Sobald auf eine Sendung einens Segments ein Timeout folgt, wird der Grenzwert auf die H�lfte des aktuellen Wertes von Congwin gesetzt und die Gr��e von CongWin auf 1 gesetzt, dann zur�ck zu Schritt 1");
        i36.addAnswer("drei doppelten ACKs wird CongWin habiert unf w�chst dann linear");
        i36.addWrong("Sobald auf eine Sendung einens Segments ein Timeout folgt, wird der Grenzwert auf die H�lfte des aktuellen Wertes von Congwin gesetzt und die Gr��e von CongWin auf 1 gesetzt, dann zur�ck zu Schritt 2");
        i36.addWrong("bei doppeltem ACK wird CongWin habiert unf w�chst dann linear");
        addInhalt(i36);
        
        setFrage();  
        
        
	}

}
