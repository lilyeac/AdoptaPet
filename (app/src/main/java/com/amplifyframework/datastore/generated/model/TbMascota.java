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

/** This is an auto generated class representing the TbMascota type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "TbMascotas", authRules = {
  @AuthRule(allow = AuthStrategy.PUBLIC, operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
public final class TbMascota implements Model {
  public static final QueryField ID = field("TbMascota", "id");
  public static final QueryField NOM_MAS = field("TbMascota", "nom_mas");
  public static final QueryField RAZA_MAS = field("TbMascota", "raza_mas");
  public static final QueryField EDAD_MAS = field("TbMascota", "edad_mas");
  public static final QueryField TAM_MAS = field("TbMascota", "tam_mas");
  public static final QueryField DES_MAS = field("TbMascota", "des_mas");
  public static final QueryField VAC_MAS = field("TbMascota", "vac_mas");
  public static final QueryField SEXO_MAS = field("TbMascota", "sexo_mas");
  public static final QueryField ID_ESTADO = field("TbMascota", "id_estado");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String") String nom_mas;
  private final @ModelField(targetType="String") String raza_mas;
  private final @ModelField(targetType="String") String edad_mas;
  private final @ModelField(targetType="String") String tam_mas;
  private final @ModelField(targetType="String") String des_mas;
  private final @ModelField(targetType="String") String vac_mas;
  private final @ModelField(targetType="String") String sexo_mas;
  private final @ModelField(targetType="String") String id_estado;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public String getNomMas() {
      return nom_mas;
  }
  
  public String getRazaMas() {
      return raza_mas;
  }
  
  public String getEdadMas() {
      return edad_mas;
  }
  
  public String getTamMas() {
      return tam_mas;
  }
  
  public String getDesMas() {
      return des_mas;
  }
  
  public String getVacMas() {
      return vac_mas;
  }
  
  public String getSexoMas() {
      return sexo_mas;
  }
  
  public String getIdEstado() {
      return id_estado;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private TbMascota(String id, String nom_mas, String raza_mas, String edad_mas, String tam_mas, String des_mas, String vac_mas, String sexo_mas, String id_estado) {
    this.id = id;
    this.nom_mas = nom_mas;
    this.raza_mas = raza_mas;
    this.edad_mas = edad_mas;
    this.tam_mas = tam_mas;
    this.des_mas = des_mas;
    this.vac_mas = vac_mas;
    this.sexo_mas = sexo_mas;
    this.id_estado = id_estado;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      TbMascota tbMascota = (TbMascota) obj;
      return ObjectsCompat.equals(getId(), tbMascota.getId()) &&
              ObjectsCompat.equals(getNomMas(), tbMascota.getNomMas()) &&
              ObjectsCompat.equals(getRazaMas(), tbMascota.getRazaMas()) &&
              ObjectsCompat.equals(getEdadMas(), tbMascota.getEdadMas()) &&
              ObjectsCompat.equals(getTamMas(), tbMascota.getTamMas()) &&
              ObjectsCompat.equals(getDesMas(), tbMascota.getDesMas()) &&
              ObjectsCompat.equals(getVacMas(), tbMascota.getVacMas()) &&
              ObjectsCompat.equals(getSexoMas(), tbMascota.getSexoMas()) &&
              ObjectsCompat.equals(getIdEstado(), tbMascota.getIdEstado()) &&
              ObjectsCompat.equals(getCreatedAt(), tbMascota.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), tbMascota.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getNomMas())
      .append(getRazaMas())
      .append(getEdadMas())
      .append(getTamMas())
      .append(getDesMas())
      .append(getVacMas())
      .append(getSexoMas())
      .append(getIdEstado())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("TbMascota {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("nom_mas=" + String.valueOf(getNomMas()) + ", ")
      .append("raza_mas=" + String.valueOf(getRazaMas()) + ", ")
      .append("edad_mas=" + String.valueOf(getEdadMas()) + ", ")
      .append("tam_mas=" + String.valueOf(getTamMas()) + ", ")
      .append("des_mas=" + String.valueOf(getDesMas()) + ", ")
      .append("vac_mas=" + String.valueOf(getVacMas()) + ", ")
      .append("sexo_mas=" + String.valueOf(getSexoMas()) + ", ")
      .append("id_estado=" + String.valueOf(getIdEstado()) + ", ")
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
  public static TbMascota justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new TbMascota(
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
      nom_mas,
      raza_mas,
      edad_mas,
      tam_mas,
      des_mas,
      vac_mas,
      sexo_mas,
      id_estado);
  }
  public interface BuildStep {
    TbMascota build();
    BuildStep id(String id) throws IllegalArgumentException;
    BuildStep nomMas(String nomMas);
    BuildStep razaMas(String razaMas);
    BuildStep edadMas(String edadMas);
    BuildStep tamMas(String tamMas);
    BuildStep desMas(String desMas);
    BuildStep vacMas(String vacMas);
    BuildStep sexoMas(String sexoMas);
    BuildStep idEstado(String idEstado);
  }
  

  public static class Builder implements BuildStep {
    private String id;
    private String nom_mas;
    private String raza_mas;
    private String edad_mas;
    private String tam_mas;
    private String des_mas;
    private String vac_mas;
    private String sexo_mas;
    private String id_estado;
    @Override
     public TbMascota build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new TbMascota(
          id,
          nom_mas,
          raza_mas,
          edad_mas,
          tam_mas,
          des_mas,
          vac_mas,
          sexo_mas,
          id_estado);
    }
    
    @Override
     public BuildStep nomMas(String nomMas) {
        this.nom_mas = nomMas;
        return this;
    }
    
    @Override
     public BuildStep razaMas(String razaMas) {
        this.raza_mas = razaMas;
        return this;
    }
    
    @Override
     public BuildStep edadMas(String edadMas) {
        this.edad_mas = edadMas;
        return this;
    }
    
    @Override
     public BuildStep tamMas(String tamMas) {
        this.tam_mas = tamMas;
        return this;
    }
    
    @Override
     public BuildStep desMas(String desMas) {
        this.des_mas = desMas;
        return this;
    }
    
    @Override
     public BuildStep vacMas(String vacMas) {
        this.vac_mas = vacMas;
        return this;
    }
    
    @Override
     public BuildStep sexoMas(String sexoMas) {
        this.sexo_mas = sexoMas;
        return this;
    }
    
    @Override
     public BuildStep idEstado(String idEstado) {
        this.id_estado = idEstado;
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
    private CopyOfBuilder(String id, String nomMas, String razaMas, String edadMas, String tamMas, String desMas, String vacMas, String sexoMas, String idEstado) {
      super.id(id);
      super.nomMas(nomMas)
        .razaMas(razaMas)
        .edadMas(edadMas)
        .tamMas(tamMas)
        .desMas(desMas)
        .vacMas(vacMas)
        .sexoMas(sexoMas)
        .idEstado(idEstado);
    }
    
    @Override
     public CopyOfBuilder nomMas(String nomMas) {
      return (CopyOfBuilder) super.nomMas(nomMas);
    }
    
    @Override
     public CopyOfBuilder razaMas(String razaMas) {
      return (CopyOfBuilder) super.razaMas(razaMas);
    }
    
    @Override
     public CopyOfBuilder edadMas(String edadMas) {
      return (CopyOfBuilder) super.edadMas(edadMas);
    }
    
    @Override
     public CopyOfBuilder tamMas(String tamMas) {
      return (CopyOfBuilder) super.tamMas(tamMas);
    }
    
    @Override
     public CopyOfBuilder desMas(String desMas) {
      return (CopyOfBuilder) super.desMas(desMas);
    }
    
    @Override
     public CopyOfBuilder vacMas(String vacMas) {
      return (CopyOfBuilder) super.vacMas(vacMas);
    }
    
    @Override
     public CopyOfBuilder sexoMas(String sexoMas) {
      return (CopyOfBuilder) super.sexoMas(sexoMas);
    }
    
    @Override
     public CopyOfBuilder idEstado(String idEstado) {
      return (CopyOfBuilder) super.idEstado(idEstado);
    }
  }
  
}
