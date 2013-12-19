/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jee.resources;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlUpdate;
import com.avaje.ebean.Transaction;
import com.avaje.ebean.annotation.Transactional;
import jee.model.Utilisateur;
import java.util.Date;
import java.util.List;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author bdiop
 */
@Path( "/utilisateur" )
public class UtilisateurResource {
    
    
    @GET
    @Produces( MediaType.APPLICATION_JSON )
    public void adduser()
            throws Exception
    {
           
          Utilisateur user = new Utilisateur("momo","ighachane","M","toto@gmail.com",new Date());
          Ebean.save(user);
    }
    
    @GET @Path("/get")
    @Produces( MediaType.APPLICATION_JSON )
    public List<Utilisateur> getuser(){
        List<Utilisateur> users = Ebean.find(Utilisateur.class).findList();
        return users;
    }
    

}

    

