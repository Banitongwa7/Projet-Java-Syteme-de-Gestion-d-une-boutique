import java.util.*;
import java.text.SimpleDateFormat;  
import java.util.Date;
public class Management {
	 ArrayList<User> ListUser = new ArrayList<User>();
	 ArrayList<Article> lesArticles = new ArrayList<Article>();
	 ArrayList<Article> lesArticles2 = new ArrayList<Article>();
     ArrayList<Fournisseur>lesFournisseurs=new ArrayList<Fournisseur>();
     Scanner valeur = new Scanner(System.in);
     ArrayList<Marque>lesMarques=new ArrayList<Marque>();
     ArrayList<Categorie> lesCategories = new ArrayList<Categorie>();
	 ArrayList<commande> mesCommandes=new ArrayList<commande>();
	 ArrayList<Ligne_Commande>maLigne=new ArrayList<Ligne_Commande>();
     static int idd = 0;
	 Date date=java.util.Calendar.getInstance().getTime();  
	 String choix="";
    
     
     
     // Methode pour creer un compte
     
     public void creationCompte()
     {
		
		 String cree="OUI";
		while(cree.equals("OUI")){
			User personne = new User();
    	  System.out.println("********* Creation de votre compte *********");
          System.out.println("- Nom : ");
          personne.setNomUser(valeur.nextLine());
          System.out.println("- Prenom : ");
          personne.setPrenomUser(valeur.nextLine());
          System.out.println("- Login : ");
          personne.setLoginUser(valeur.nextLine());
          System.out.println("- Mot de passe : ");
          personne.setMotDePasseUser(valeur.nextLine());
          System.out.println("- Date de naissance : ");
          personne.setDateDeNaissanceUser(valeur.nextLine());
          System.out.println("- Role : ");
          personne.setRoleUser(valeur.nextLine());
          System.out.println("- Adresse : ");
          personne.setAdresseUser(valeur.nextLine());
          System.out.println("- Adresse Email : ");
          personne.setAdresseEmailUser(valeur.nextLine());
          System.out.println("- Pays : ");
          personne.setPaysuser(valeur.nextLine());
          System.out.println("- Ville : ");
          personne.setVilleUser(valeur.nextLine());
		  ListUser.add(personne);
		  System.out.println("Voulez vous creer un autre compte (oui/non) ? : ");
		  cree=valeur.nextLine();
		  cree=cree.toUpperCase();
		  if(cree.equals("NON")){
	
			  Connexion();
		  }
		}
	 }
     
     // methode connexion d'un User
     
	 public void Connexion(){
		boolean connecte=false;
		int entre=0;
		while(connecte==false)
		{
			 System.out.println("   ");
			 System.out.println("********************** PAGE DE CONNEXION **********************");
			 System.out.println("   ");
			 System.out.println("- Entrez votre Login : ");
			 choix=valeur.nextLine();
			 String role="";
			 System.out.println("- Entrez votre mot de passe : ");
			 String mdp=valeur.nextLine();
		 
			 for(User Us:ListUser)
			 {
				 if(choix.equals(Us.getLoginUser())&& mdp.equals(Us.getMotDePasseUser()))
				 {
					role=Us.getRoleUser();
					entre=1;
					break;
				 }
			 }
		 if(entre==1){
			
			if(role.equals("client"))
			{
				System.out.println("  ");
				System.out.println("************ VOUS ETES CONNECTE EN TANT QUE CLIENT ************");
				System.out.println("  ");
				boolean cont=true;
				while(cont){

				
				String MonChoix=MenuClient();
				int leChoix=0;
				leChoix=Integer.parseInt(MonChoix);
				switch (leChoix){
					case 1:
						AffichageArt();
						break;
					case 2:
						creerCommande();
						break;
					case 3:
						AfficherCommande();
						break;
					case 4:
						System.out.println(utilisateur(choix,mdp).toString());
						break;
					case 5:
						System.out.println("Health & life est une entreprise cosmetique situee en plein centre-ville de Kinshasa.  Cree en 2011, elle est aujourd hui la meilleure.");
						System.out.println("L entreprise a pour objectif de rendre accessible les produits venant des pays exterieurs a  la population congolaise. ");
						System.out.println("Ayant pour fournisseur, des partenaires en France, en chine, au japon Elle se donne comme mandat de partager sa vision ");					
						System.out.println("au grand public en creant une communaute qui changera la perception sur l industrie des cosmetiques.L entreprise desire");
						System.out.println("partager sa vision afin d'encourager un mode de vie sain pour amener le corps a  etre en symbiose avec l esprit.Ainsi, ");
						System.out.println("chaque etre humain valorisera davantage sa beaute interieure");
						break;
					case 6:
						cont=false;
						System.out.println("Appuyer sur 1 pour revenir a la page connection, autre pour quitter.");
						choix=valeur.nextLine();
						int nChoix=Integer.parseInt(choix);
						if(nChoix==1){
							break;
						}else{
							System.out.println("**************** MERCI POUR LA CONFIANCE. A LA PROCHAINE ! ****************");		
							cont=false;
							connecte = true;
							break;					
						}
					
					default:
						System.out.println("ERREUR DE SAISIE");
						break;

					}
				}
			}


			if(role.equals("admin")){
				System.out.println("  ");
				System.out.println("************ VOUS ETES CONNECTE EN TANT QUE ADMIN ************");
				System.out.println("  ");
				boolean cont=true;
				while(cont)
				{
				String MonChoix=MenuAdmin();
				int leChoix=0;
				leChoix=Integer.parseInt(MonChoix);
				switch (leChoix){
					case 1:
						AffichageArt();
						break;
					case 2:
						creerFournisseur();
						break;
					case 3:
						supprimerArticle();
						break;
					case 4:
						VoirClients();
						break;
					case 5:
						VoirFournisseurs();
						break;
					case 6:
						ajoutMarque();
						break;
					case 7:
						VoirMarque();
						break;
					case 8:
						cont=false;
						System.out.println("Appuyer sur 1 pour revenir a la page connection, autre pour quitter.");
						choix=valeur.nextLine();
						int nChoix=Integer.parseInt(choix);
						if(nChoix==1){
							break;
						}else{
							System.out.println("**************** MERCI POUR LA CONFIANCE. A LA PROCHAINE ! ****************");
							cont=false;
							connecte = true;
							break;	
						}
					default:
						System.out.println("ERREUR DE SAISIE");
						break;

				}	
			}		
		}


		 }


		}
	 }
     
     //Methode pour consulter un profile
     
     public void consulterProfile(User u)
     {
    	 System.out.println("********* Consultation profile *********");
    	 System.out.println(u.toString());
    	 System.out.println("   ");
     }
     
     //Methode pour supprimer un compte
     
     public void supprimerCompte(int id)
     {
    	 System.out.println("Voulez-vous supprimer le compte (oui/non) ?  : ");
    	 String rep = valeur.nextLine();

         if (rep == "oui") {
             ListUser.remove(id);
             System.out.println("le compte a ete supprimer !");
         }
         System.out.println("   ");
     }
     
   //Methode pour ajouter une marque
     
     public void ajoutMarque(){
    	 System.out.println("********* Ajout de la marque *********");
         String repM="oui";
         while(repM.equals("oui"))
         {
                Marque Mr=new Marque();
                System.out.println("- Entrez le libelle de la marque : ");
                Mr.setLibelleMarque(valeur.nextLine());
                lesMarques.add(Mr);
                System.out.println("Voulez vous ajouter une marque (oui/non) ? : ");
                repM=valeur.nextLine();
        }
         System.out.println("   ");
     
        }
     
     //Methode pour ajouter un article
     
     public void ajouterArticle()
     {
    	 System.out.println("********* Creation de l'article *********");
    	 
        String reponse="oui";
        while(reponse.equals("oui"))
        {
        	
        	idd++;
	    	 Article Art = new Article();
	    	 Art.setID_Article(idd);
	    	 System.out.println("- Libelle de l'article : ");
	         Art.setLibelleArticle(valeur.nextLine());
	         
	        System.out.println("- Entrez la description de l'article : ");
	         Art.setDescriptionArticle(valeur.nextLine());
	        System.out.println("- Entrez la taxe Article : ");
	        Art.setTaxeArticle(valeur.nextDouble());
	        System.out.println("- Entrez le prix Article : ");
	        Art.setPrixArticle(valeur.nextDouble());
	        System.out.println("- Entrez la quantite disponible : ");
			Art.setQuantiteDisponibleArticle(valeur.nextInt());
			Art.setDateAjoutArticle(date);
	        String test = valeur.nextLine();
	        
	        System.out.println("- Entrez la Categorie de l'article : ");
	        Art.setCategorieinit(valeur.nextLine());
	        System.out.println("  ");
	        System.out.println("VOICI LA LISTE DES MARQUES :");
	        System.out.println("  ");
	        for(Marque M: lesMarques){
	            System.out.println(M.getLibelleMarque());
	        }
	        System.out.println("- Veuillez saisir la marque de l'article : ");
	        String MaMarque=valeur.nextLine();
	        for(int i=0;i<lesMarques.size();i++)
	        {
	            if(lesMarques.get(i).getLibelleMarque().equals(MaMarque))
	            {
	              
	                Art.setMarque(lesMarques.get(i));
	            }
	        }
			lesArticles.add(Art);
			lesArticles2.add(Art);
	        System.out.println("Voulez vous-ajouter un article (oui/non) ? ");
	        reponse=valeur.nextLine();
        }
        System.out.println("   ");
    }
     
     
     // Methode pour supprimer un article
     public void supprimerArticle()
     {
    	 System.out.println("- Veuillez saisir le libelle de l'article a supprimer : ");
	      choix=valeur.nextLine();
	     for(Article art : lesArticles)
	     {
	    	 if(art.getLibelleArticle().equals(choix))
	    	 {
	    		 lesArticles.remove(art);
	    		 System.out.println("L'article a bien ete supprimer !");
	    	 }
	     }
     }

   //Methode pour afficher les articles
        public void AffichageArt(){
            for (Article  A: lesArticles2) {
                System.out.println(A.toString());
            }
        }
        
        
      //Methode pour creer un fournisseur
        
    public void creerFournisseur(){
    	System.out.println("********* Creation des Fournisseurs *********");
        String continu="oui";
        while(continu.equals("oui"))
        {
		    Fournisseur Fn=new Fournisseur();
		    System.out.println("- Entrez le nom du Fournisseur : ");
		    Fn.setNomF(valeur.nextLine());
		    System.out.println("- Entrez l'adresse du fournisseur : ");
		    Fn.setAdFourn(valeur.nextLine());
		    System.out.println("- Entrez le numero de telephone : ");
		    Fn.setNumber(valeur.nextInt());
		    System.out.println("- Entrez le pays du fournisseur : ");
		    Fn.setPaysF(valeur.nextLine());
		    System.out.println("- Entrez la ville du Fournisseur : ");
		    Fn.setVilleF(valeur.nextLine());
			ajouterArticle();
			for(Article Ar:lesArticles){
				Fn.AjouterArticle(Ar);
			}
			lesArticles.clear();
			lesFournisseurs.add(Fn);
			System.out.println("Voulez vous ajouter un autre Fournisseur (oui/non) ?");
			continu = valeur.nextLine();

		}
        }
        
  //Methode pour creer une categorie
    public void creationCat()
       {
    	   for(Article a : lesArticles)
    	   {
    		   Categorie cate = new Categorie();
    		   
    		   if(lesCategories.isEmpty())
    		   {
    			  cate.setLibelleCategorie(a.getCategorieinit()); 
    			  cate.ajouterArticle(a);
    			  lesCategories.add(cate);
    		   }
    		   else
    		   {
    			   boolean test = true;
    			   for(Categorie cat : lesCategories)
    			   {
    				   if(cat.getLibelleCategorie().equals(a.getCategorieinit()))
    				   {
    					   cat.ajouterArticle(a);
    					   test = false;
    				   }
    			   }
    			   if(test)
    			   {
    				   cate.setLibelleCategorie(a.getCategorieinit()); 
    	    		   cate.ajouterArticle(a);
    	    		   lesCategories.add(cate);
    			   }
    		   }
    	   }
       }
    
    // Methode afficher les categories
    
    public void afficherCategorie()
    {
    	System.out.println("********* Les Categories *********");
    	for(Categorie cate : lesCategories)
    	{
    		cate.Affichage();
    	}
	}
	//Methode de creation de commande
	public void creerCommande(){
		int i=1;
		int qte;
		String choix;
		for(Article Art:lesArticles2){
			System.out.println(i+") "+Art.getLibelleArticle()+" : Prix = "+Art.getPrixArticle()+" :Quantte = "+Art.getQuantiteDisponibleArticle()+" Taxe = "+Art.getTaxeArticle());
			i++;
		}
		
		System.out.println("************************** FAITES VOTRE CHOIX *******************************************");
		choix=valeur.nextLine();
		for(Article Art:lesArticles2){
			if(choix.equals(Art.getLibelleArticle())){
				if(Art.getQuantiteDisponibleArticle()==0){
					System.out.println("RUPTURE DE STOCK DE L'ARTICLE");
				}else{
					commande cm1=new commande();	
					Facture F1=new Facture();
					Ligne_Commande L_cm1=new Ligne_Commande();		
					System.out.println("- Entrez la quantite de l'article : ");
					qte=valeur.nextInt();
					Art.decrementerArticle(qte);
					String abc=valeur.nextLine();
					System.out.println("- Veuillez saisir le lieu de livraison : ");
					cm1.setLieuLivr(valeur.nextLine());
					cm1.setMntCom(qte*Art.getPrixArticle());
					System.out.println("- Precisez le mode de paiement : ");
					cm1.setModePay(valeur.nextLine());
					System.out.println("Voulez vous confirmer votre commande (oui/non) ? : ");
					choix=valeur.nextLine();
					choix=choix.toUpperCase();
					if(choix.equals("OUI")){
						cm1.setValidCom(false);
						mesCommandes.add(cm1);	
						L_cm1.setIDArticle(Art.getID_Article());
						L_cm1.setIDCommande(cm1.GetIdCommande());
						L_cm1.setDateCommande(date);
						L_cm1.setQteArticle(qte);
						maLigne.add(L_cm1);
						F1.setPrixTotal(qte*Art.getPrixArticle()*Art.getTaxeArticle());

						System.out.println("Voulez vous avoir votre facture (oui/non) ? : ");
						choix=valeur.nextLine();
						choix=choix.toUpperCase();
						if(choix.equals("OUI")){
							System.out.println("**** FACTURE NUMERO "+ F1.GetId_Facture()+" MONTANT (TTC) A PAYER : "+F1.GetPrixTotal()+ " ****");
						}

					}else{
						System.out.println("Votre commande a ete annulee ");
					}
				}
			}
		}
		
	}
	public void AfficherLigneCommande(){
		for(Ligne_Commande LC:maLigne){
			System.out.println(LC.toString());
		}
	}
	public void AfficherCommande(){
		for(commande ms:mesCommandes){
			System.out.println(ms.toString());
		}
	}
	public String MenuAdmin(){
		String Monchoix;	
    	System.out.println("********************** ESPACE ADMINISTRATEUR ************************");
    	System.out.println("*                                                                   *");
    	System.out.println("*                                                                   *");
    	System.out.println("*1) Consulter les articles                                          *");
    	System.out.println("*2) Creer un fournisseur                                            *");
    	System.out.println("*3) Supprimer un article                                            *");
    	System.out.println("*4) Consulter les clients enregistres sur le site web               *");
    	System.out.println("*5) Consulter les fournisseurs                                      *");
    	System.out.println("*6) Creer une marque                                                *");
    	System.out.println("*7) Consulter les marques                                           *");
    	System.out.println("*8) Quitter                                                         *");
    	System.out.println("*                                                                   *");
    	System.out.println("*                                                                   *");
    	System.out.println("*********************************************************************");
    	System.out.println("Votre Choix : ");
    	Monchoix = valeur.nextLine();	
		return Monchoix;
	}
	public String MenuClient(){
		String Monchoix;
    	System.out.println("************ BIENVENUE SUR LE SITE WEB HEALTH AND LIFE **************");
    	System.out.println("*                                                                   *");
    	System.out.println("*                                                                   *");
    	System.out.println("*1) Consulter les articles                                          *");
    	System.out.println("*2) Commander un article                                            *");
    	System.out.println("*3) Consulter la commande                                           *");
    	System.out.println("*4) Consulter mon profile                                           *");
    	System.out.println("*5) A propos de l'entreprise                                        *");
    	System.out.println("*6) Quitter                                                         *");
    	System.out.println("*                                                                   *");
    	System.out.println("*                                                                   *");
    	System.out.println("*********************************************************************");
    	System.out.println("Votre Choix : ");
    	Monchoix = valeur.nextLine();
		return Monchoix;
	}
	public User utilisateur(String name,String password){
		User U=new User();
		for(User Us:ListUser){
			if(name.equals(Us.getLoginUser())&& password.equals(Us.getMotDePasseUser())){
				U=Us;

			}

		}
		return U;
	}
	public void VoirClients(){
		for(User U:ListUser){
			if(U.getRoleUser().equals("client")){
				System.out.println(U.toString());
			}
		}
	}

	public void VoirFournisseurs(){
		for(Fournisseur Fn:lesFournisseurs){
			System.out.println(Fn.toString());
			}
		}
	
	public void VoirMarque(){
		for(Marque Mr : lesMarques){
			System.out.println(Mr.toString());
		}
	}

	


}
