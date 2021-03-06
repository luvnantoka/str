package my.slack.base;

public class SlashCommandResponse {
	private String oken;
	private String team_id;
	private String  team_domain;
	private String channel_id;
	private String  channel_name;
	private String  timestamp;
	private String  user_name;
	private String text;
	private String trigger_word;
	public String getOken() {
		return oken;
	}
	public void setOken(String oken) {
		this.oken = oken;
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
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getTrigger_word() {
		return trigger_word;
	}
	public void setTrigger_word(String trigger_word) {
		this.trigger_word = trigger_word;
	}
}
