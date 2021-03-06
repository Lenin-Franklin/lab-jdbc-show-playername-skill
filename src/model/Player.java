package model;

public class Player
{
	private Long playerId;
	private String name;
	private String country;
	
	private Skill skill;
	
	public Player(Long playerId, String name, String country, Skill skill) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	public Long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
		
}

