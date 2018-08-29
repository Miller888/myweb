package Student.Harry.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Model  implements ActionListener {
	String url;
	GUI gui;
	Model(GUI gui) {
		this.gui = gui;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String sendGet() throws Exception {
		setUrl(gui.url_textArea.getText());
		StringBuffer res = new StringBuffer();
		InputStream raw;
		InputStreamReader reader;
		URL u = new URL(getUrl());
		HttpsURLConnection uc = (HttpsURLConnection) u.openConnection();
		if (uc.getResponseCode() == 200) {
			raw = uc.getInputStream();
			reader = new InputStreamReader(raw);
			int c;
			char a;
			while ((c = reader.read()) != -1) {
				a = (char) c;
				res.append(a);
			}
		} else {
			raw = uc.getErrorStream();
			reader = new InputStreamReader(raw);
			int c;
			char a;
			while ((c = reader.read()) != -1) {
				a = (char) c;
				res.append(a);
			}
		}
		return res.toString();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Sent") {
			try {
				System.out.println("按鈕已觸發!");
				gui.response_texArea.setText(sendGet());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
