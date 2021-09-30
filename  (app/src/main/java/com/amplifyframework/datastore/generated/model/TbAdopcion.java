package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.annotations.BelongsTo;
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

/** This is an auto generated class representing the TbAdopcion type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "TbAdopcions", authRules = {
  @AuthRule(allow = AuthStrategy.PUBLIC, operations = { ModelOperation.CREATE, ModelOperation.UPDATE, ModelOperation.DELETE, ModelOperation.READ })
})
public final class TbAdopcion implements Model {
  public static final QueryField ID = field("TbAdopcion", "id");
  public static final QueryField TB_USUARIO = field("TbAdopcion", "tbAdopcionTbUsuarioId");
  public static final QueryField TB_MASCOTA = field("TbAdopcion", "tbAdopcionTbMascotaId");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="TbUsuario") @BelongsTo(targetName = "tbAdopcionTbUsuarioId", type = TbUsuario.class) TbUsuario TbUsuario;
  private final @ModelField(targetType="TbMascota") @BelongsTo(targetName = "tbAdopcionTbMascotaId", type = TbMascota.class) TbMascota TbMascota;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public TbUsuario getTbUsuario() {
      return TbUsuario;
  }
  
  public TbMascota getTbMascota() {
      return TbMascota;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private TbAdopcion(String id, TbUsuario TbUsuario, TbMascota TbMascota) {
    this.id = id;
    this.TbUsuario = TbUsuario;
    this.TbMascota = TbMascota;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      TbAdopcion tbAdopcion = (TbAdopcion) obj;
      return ObjectsCompat.equals(getId(), tbAdopcion.getId()) &&
              ObjectsCompat.equals(getTbUsuario(), tbAdopcion.getTbUsuario()) &&
              ObjectsCompat.equals(getTbMascota(), tbAdopcion.getTbMascota()) &&
              ObjectsCompat.equals(getCreatedAt(), tbAdopcion.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), tbAdopcion.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getTbUsuario())
      .append(getTbMascota())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("TbAdopcion {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("TbUsuario=" + String.valueOf(getTbUsuario()) + ", ")
      .append("TbMascota=" + String.valueOf(getTbMascota()) + ", ")
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
  public static TbAdopcion justId(String id) {
    try {
      UUID.fromString(id); // Check that ID is in the UUID format - if not an exception is thrown
    } catch (Exception exception) {
      throw new IllegalArgumentException(
              "Model IDs must be unique in the format of UUID. This method is for creating instances " +
              "of an existing object with only its ID field for sending as a mutation parameter. When " +
              "creating a new object, use the standard builder method and leave the ID field blank."
      );
    }
    return new TbAdopcion(
      id,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      TbUsuario,
      TbMascota);
  }
  public interface BuildStep {
    TbAdopcion build();
    BuildStep id(String id) throws IllegalArgumentException;
    BuildStep tbUsuario(TbUsuario tbUsuario);
    BuildStep tbMascota(TbMascota tbMascota);
  }
  

  public static class Builder implements BuildStep {
    private String id;
    private TbUsuario TbUsuario;
    private TbMascota TbMascota;
    @Override
     public TbAdopcion build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new TbAdopcion(
          id,
          TbUsuario,
          TbMascota);
    }
    
    @Override
     public BuildStep tbUsuario(TbUsuario tbUsuario) {
        this.TbUsuario = tbUsuario;
        return this;
    }
    
    @Override
     public BuildStep tbMascota(TbMascota tbMascota) {
        this.TbMascota = tbMascota;
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
    private CopyOfBuilder(String id, TbUsuario tbUsuario, TbMascota tbMascota) {
      super.id(id);
      super.tbUsuario(tbUsuario)
        .tbMascota(tbMascota);
    }
    
    @Override
     public CopyOfBuilder tbUsuario(TbUsuario tbUsuario) {
      return (CopyOfBuilder) super.tbUsuario(tbUsuario);
    }
    
    @Override
     public CopyOfBuilder tbMascota(TbMascota tbMascota) {
      return (CopyOfBuilder) super.tbMascota(tbMascota);
    }
  }
  
}
