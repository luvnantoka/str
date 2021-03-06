package my.slack.base;

public class SlashCommandRequest {
	private String token;
	private String team_id;
	private String  team_domain;
	private String channel_id;
	private String  channel_name;
	private String  timestamp;
	private String command;
	private String response_url;
	private String  user_name;
	private String text;
	/**
	 * コマンド部分を取得します<BR>
	 * @return
	 */
	public String getCommand() {
		return command;
	}
	/**
	 * コマンド部分をセットします<BR>
	 * @param command
	 */
	public void setCommand(String command) {
		this.command = command;
	}
	public String getResponse_url() {
		return response_url;
	}
	public void setResponse_url(String response_url) {
		this.response_url = response_url;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getTeam_id() {
		return team_id;
	}
	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}
	public String getTeam_domain() {
		return team_domain;
	}
	public void setTeam_domain(String team_domain) {
		this.team_domain = team_domain;
	}
	public String getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}
	public String getChannel_name() {
		return channel_name;
	}
	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * テキスト部分だけを取得します<BR>
	 * @return
	 */
	public String getText() {
		return text;
	}
	/**
	 * テキスト部分だけをセットします<BR>
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}
}
