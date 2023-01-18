import java.net.Socket;

public class App {
	public static void main(String[] args) throws Exception {
		String Host = ""; // The Host to Scan

		for (int Port = 1; Port <= 65535; Port++) { // Scan All 65535 Ports
			try {
				Socket socket = new Socket(Host, Port);
				System.out.println("Port " + Port + " is Open!");
				socket.close();
			} catch (Exception Error) {
				// Exception Means Port is Closed or Filtered.
			}
		}
	}
}