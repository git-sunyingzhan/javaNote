package fightLandlords;


//牌类
public class Poker implements Comparable<Poker>{
	/**
	 * suit:花色
	 * rank:点数
	 * id:通过ID来区分牌的大小
	 */
	private String suit;
	private String rank;
	private int id;
	
	public Poker(String suit,String rank,int id) {
		this.suit = suit;
		this.rank = rank;
		this.id = id;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poker other = (Poker) obj;
		if (id != other.id)
			return false;
		if (rank == null) {
			if (other.rank != null)
				return false;
		} else if (!rank.equals(other.rank))
			return false;
		if (suit == null) {
			if (other.suit != null)
				return false;
		} else if (!suit.equals(other.suit))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return  suit + rank ;
	}
	@Override
	public int compareTo(Poker p) {
		return this.id-p.id;
	}
}
