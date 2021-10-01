package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.AuthStrategy;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelOperation;
import com.amplifyframework.core.model.annotations.AuthRule;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the TbUsuario type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "TbUsuarios", authRules = {
  @AuthRule(allow = AuthStrategy.PUBLIC, operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
public final class TbUsuario implements Model {
  public static final QueryField ID = field("TbUsuario", "id");
  public static final QueryField NOM_US = field("TbUsuario", "nom_us");
  public static final QueryField APE_US = field("TbUsuario", "ape_us");
  public static final QueryField DER_USU = field("TbUsuario", "der_usu");
  public static final QueryField NUM_USU = field("TbUsuario", "num_usu");
  public static final QueryField CEL_USU = field("TbUsuario", "cel_usu");
  public static final QueryField EMAIL_US = field("TbUsuario", "email_us");
  public static final QueryField LOGIN = field("TbUsuario", "login");
  public static final QueryField PASSWORD = field("TbUsuario", "password");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String") String nom_us;
  private final @ModelField(targetType="String") String ape_us;
  private final @ModelField(targetType="String") String der_usu;
  private final @ModelField(targetType="String") String num_usu;
  private final @ModelField(targetType="String") String cel_usu;
  private final @ModelField(targetType="String") String email_us;
  private final @ModelField(targetType="String") String login;
  private final @ModelField(targetType="String") String password;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public String getNomUs() {
      return nom_us;
  }
  
  public String getApeUs() {
      return ape_us;
  }
  
  public String getDerUsu() {
      return der_usu;
  }
  
  public String getNumUsu() {
      return num_usu;
  }
  
  public String getCelUsu() {
      return cel_usu;
  }
  
  public String getEmailUs() {
      return email_us;
  }
  
  public String getLogin() {
      return login;
  }
  
  public String getPassword() {
      return password;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private TbUsuario(String id, String nom_us, String ape_us, String der_usu, String num_usu, String cel_usu, String email_us, String login, String password) {
    this.id = id;
    this.nom_us = nom_us;
    this.ape_us = ape_us;
    this.der_usu = der_usu;
    this.num_usu = num_usu;
    this.cel_usu = cel_usu;
    this.email_us = email_us;
    this.login = login;
    this.password = password;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      TbUsuario tbUsuario = (TbUsuario) obj;
      return ObjectsCompat.equals(getId(), tbUsuario.getId()) &&
              ObjectsCompat.equals(getNomUs(), tbUsuario.getNomUs()) &&
              ObjectsCompat.equals(getApeUs(), tbUsuario.getApeUs()) &&
              ObjectsCompat.equals(getDerUsu(), tbUsuario.getDerUsu()) &&
              ObjectsCompat.equals(getNumUsu(), tbUsuario.getNumUsu()) &&
              ObjectsCompat.equals(getCelUsu(), tbUsuario.getCelUsu()) &&
              ObjectsCompat.equals(getEmailUs(), tbUsuario.getEmailUs()) &&
              ObjectsCompat.equals(getLogin(), tbUsuario.getLogin()) &&
              ObjectsCompat.equals(getPassword(), tbUsuario.getPassword()) &&
              ObjectsCompat.equals(getCreatedAt(), tbUsuario.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), tbUsuario.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getNomUs())
      .append(getApeUs())
      .append(getDerUsu())
      .append(getNumUsu())
      .append(getCelUsu())
      .append(getEmailUs())
      .append(getLogin())
      .append(getPassword())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("TbUsuario {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("nom_us=" + String.valueOf(getNomUs()) + ", ")
      .append("ape_us=" + String.valueOf(getApeUs()) + ", ")
      .append("der_usu=" + String.valueOf(getDerUsu()) + ", ")
      .append("num_usu=" + String.valueOf(getNumUsu()) + ", ")
      .append("cel_usu=" + String.valueOf(getCelUsu()) + ", ")
      .append("email_us=" + String.valueOf(getEmailUs()) + ", ")
      .append("login=" + String.valueOf(getLogin()) + ", ")
      .append("password=" + String.valueOf(getPassword()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static BuildStep builder() {
      return new Builder();
  }
  
  /** 
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   * @throws IllegalArgumentException Checks that ID is in the proper format
   */
  public static TbUsuario justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new TbUsuario(
      id,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      nom_us,
      ape_us,
      der_usu,
      num_usu,
      cel_usu,
      email_us,
      login,
      password);
  }
  public interface BuildStep {
    TbUsuario build();
    BuildStep id(String id) throws IllegalArgumentException;
    BuildStep nomUs(String nomUs);
    BuildStep apeUs(String apeUs);
    BuildStep derUsu(String derUsu);
    BuildStep numUsu(String numUsu);
    BuildStep celUsu(String celUsu);
    BuildStep emailUs(String emailUs);
    BuildStep login(String login);
    BuildStep password(String password);
  }
  

  public static class Builder implements BuildStep {
    private String id;
    private String nom_us;
    private String ape_us;
    private String der_usu;
    private String num_usu;
    private String cel_usu;
    private String email_us;
    private String login;
    private String password;
    @Override
     public TbUsuario build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new TbUsuario(
          id,
          nom_us,
          ape_us,
          der_usu,
          num_usu,
          cel_usu,
          email_us,
          login,
          password);
    }
    
    @Override
     public BuildStep nomUs(String nomUs) {
        this.nom_us = nomUs;
        return this;
    }
    
    @Override
     public BuildStep apeUs(String apeUs) {
        this.ape_us = apeUs;
        return this;
    }
    
    @Override
     public BuildStep derUsu(String derUsu) {
        this.der_usu = derUsu;
        return this;
    }
    
    @Override
     public BuildStep numUsu(String numUsu) {
        this.num_usu = numUsu;
        return this;
    }
    
    @Override
     public BuildStep celUsu(String celUsu) {
        this.cel_usu = celUsu;
        return this;
    }
    
    @Override
     public BuildStep emailUs(String emailUs) {
        this.email_us = emailUs;
        return this;
    }
    
    @Override
     public BuildStep login(String login) {
        this.login = login;
        return this;
    }
    
    @Override
     public BuildStep password(String password) {
        this.password = password;
        return this;
    }
    
    /** 
     * WARNING: Do not set ID when creating a new object. Leave this blank and one will be auto generated for you.
     * This should only be set when referring to an already existing object.
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     * @throws IllegalArgumentException Checks that ID is in the proper format
     */
    public BuildStep id(String id) throws IllegalArgumentException {
        this.id = id;
        
        try {
            UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
        } catch (Exception exception) {
          throw new IllegalArgumentException("Model IDs must be unique in the format of UUID.",
                    exception);
        }
        
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String nomUs, String apeUs, String derUsu, String numUsu, String celUsu, String emailUs, String login, String password) {
      super.id(id);
      super.nomUs(nomUs)
        .apeUs(apeUs)
        .derUsu(derUsu)
        .numUsu(numUsu)
        .celUsu(celUsu)
        .emailUs(emailUs)
        .login(login)
        .password(password);
    }
    
    @Override
     public CopyOfBuilder nomUs(String nomUs) {
      return (CopyOfBuilder) super.nomUs(nomUs);
    }
    
    @Override
     public CopyOfBuilder apeUs(String apeUs) {
      return (CopyOfBuilder) super.apeUs(apeUs);
    }
    
    @Override
     public CopyOfBuilder derUsu(String derUsu) {
      return (CopyOfBuilder) super.derUsu(derUsu);
    }
    
    @Override
     public CopyOfBuilder numUsu(String numUsu) {
      return (CopyOfBuilder) super.numUsu(numUsu);
    }
    
    @Override
     public CopyOfBuilder celUsu(String celUsu) {
      return (CopyOfBuilder) super.celUsu(celUsu);
    }
    
    @Override
     public CopyOfBuilder emailUs(String emailUs) {
      return (CopyOfBuilder) super.emailUs(emailUs);
    }
    
    @Override
     public CopyOfBuilder login(String login) {
      return (CopyOfBuilder) super.login(login);
    }
    
    @Override
     public CopyOfBuilder password(String password) {
      return (CopyOfBuilder) super.password(password);
    }
  }
  
}
