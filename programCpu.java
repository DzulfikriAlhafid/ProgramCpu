public class programCpu
{
	public static void main(String[]x)
	{
		cpu cp = new cpu(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7], x[8], x[9]);
		
		
		
		
	String motherBoard = cp.getmotherBoard();
	String powerSuplay = cp.getpowerSuplay();
	String hardisk = cp.gethardisk();
	String graphicCard = cp.getgraphicCard();
	String prosesor = cp.getprosesor();
	String ssd = cp.ssd();
	String blower = cp.getblower();
	String kabelSata= cp.getkabelSata();
	String usbPort = cp.getusbPort();
	String audioJek= cp.getaudioJek();
	
	System.out.println(motherBoard);
	System.out.println(powerSuplay);
	System.out.println(hardisk);
	System.out.println(graphicCard);
	System.out.println(prosesor);
	System.out.println(ssd);
	System.out.println(blower);
	System.out.println(kabelSata);
	System.out.println(usbPort);
	System.out.println(audioJek);
	}
}
	
	
	
	
	 