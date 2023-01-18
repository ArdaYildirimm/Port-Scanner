# Port Scanner

### How to do make Port Scanner in Java?

To create a port scanner in Java, you can use the `java.net.Socket` class to try to establish a connection to a server on a specific port. If the connection is successful, it means that the port is open, and if it fails, it means that the port is closed or blocked.

Here is an example of how you can create a simple port scanner in Java:

```
import java.net.Socket;

public class App {
	public static void main(String[] args) throws Exception {
		String Host = ""; // The Host to Scan

		for (int Port = 1; Port <= 65535; Port++) { // // Scan All 65535 Ports
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
```

This code will try to establish a connection to the host on each port from 1 to 65535 and print out the port number if the connection was successful.

Keep in mind that port scanning can be considered a form of network attack, so be sure to only use this tool for legitimate purposes and with the permission of the target host.