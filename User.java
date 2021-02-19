
public class User {
	static int ID_User = 0;
	public String NomUser;
	public String PrenomUser;
	private String LoginUser;
	private String MotDePasseUser;
	private String DateDeNaissanceUser;
	private String RoleUser;
	private String AdresseUser;
	private String AdresseEmailUser;
	private String Paysuser;
	private String VilleUser;
    public User()
	{
    	ID_User++;
	}

	public User(String nomUser, String prenomUser, String loginUser, String motDePasseUser, String dateDeNaissanceUser, String roleUser, String adresseUser, String adresseEmailUser, String paysuser, String villeUser) {
		ID_User++;
		this.NomUser = nomUser;
		this.PrenomUser = prenomUser;
		this.LoginUser = loginUser;
		this.MotDePasseUser = motDePasseUser;
		this.DateDeNaissanceUser = dateDeNaissanceUser;
		this.RoleUser = roleUser;
		this.AdresseUser = adresseUser;
		this.AdresseEmailUser = adresseEmailUser;
		this.Paysuser = paysuser;
		this.VilleUser = villeUser;
	}

	public int getID_User() {
		return ID_User;
	}

	public String getNomUser() {
		return NomUser;
	}

	public void setNomUser(String nomUser) {
		NomUser = nomUser;
	}

	public String getPrenomUser() {
		return PrenomUser;
	}

	public void setPrenomUser(String prenomUser) {
		PrenomUser = prenomUser;
	}

	public String getLoginUser() {
		return LoginUser;
	}

	public void setLoginUser(String loginUser) {
		LoginUser = loginUser;
	}

	public String getMotDePasseUser() {
		return MotDePasseUser;
	}

	public void setMotDePasseUser(String motDePasseUser) {
		MotDePasseUser = motDePasseUser;
	}

	public String getDateDeNaissanceUser() {
		return DateDeNaissanceUser;
	}

	public void setDateDeNaissanceUser(String dateDeNaissanceUser) {
		DateDeNaissanceUser = dateDeNaissanceUser;
	}

	public String getRoleUser() {
		return RoleUser;
	}

	public void setRoleUser(String roleUser) {
		RoleUser = roleUser;
	}

	public String getAdresseUser() {
		return AdresseUser;
	}

	public void setAdresseUser(String adresseUser) {
		AdresseUser = adresseUser;
	}

	public String getAdresseEmailUser() {
		return AdresseEmailUser;
	}

	public void setAdresseEmailUser(String adresseEmailUser) {
		AdresseEmailUser = adresseEmailUser;
	}

	public String getPaysuser() {
		return Paysuser;
	}

	public void setPaysuser(String paysuser) {
		Paysuser = paysuser;
	}

	public String getVilleUser() {
		return VilleUser;
	}

	public void setVilleUser(String villeUser) {
		VilleUser = villeUser;
	}

    @Override
    public String toString() {
        return " **** Profil ****\n" +
                "- ID : '" + ID_User + '\'' +
                "\n- Nom : '" + NomUser + '\'' +
                "\n- Prenom : '" + PrenomUser + '\'' +
                "\n- Login : '" + LoginUser + '\'' +
                "\n- Mot De Passe : '" + MotDePasseUser + '\'' +
                "\n- Date De Naissance : " + DateDeNaissanceUser +
                "\n- Role : '" + RoleUser + '\'' +
                "\n- Adresse : '" + AdresseUser + '\'' +
                "\n- Adresse Email : '" + AdresseEmailUser + '\'' +
                "\n- Pays : '" + Paysuser + '\'' +
                "\n- Ville : '" + VilleUser + '\'' +"";
    }



}

