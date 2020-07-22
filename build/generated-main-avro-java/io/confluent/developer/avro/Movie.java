/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.confluent.developer.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Movie extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -250214681334179885L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Movie\",\"namespace\":\"io.confluent.developer.avro\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"title\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"release_year\",\"type\":\"int\"},{\"name\":\"genre\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Movie> ENCODER =
      new BinaryMessageEncoder<Movie>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Movie> DECODER =
      new BinaryMessageDecoder<Movie>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Movie> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Movie> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Movie>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Movie to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Movie from a ByteBuffer. */
  public static Movie fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long id;
  @Deprecated public java.lang.String title;
  @Deprecated public int release_year;
  @Deprecated public java.lang.String genre;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Movie() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param title The new value for title
   * @param release_year The new value for release_year
   * @param genre The new value for genre
   */
  public Movie(java.lang.Long id, java.lang.String title, java.lang.Integer release_year, java.lang.String genre) {
    this.id = id;
    this.title = title;
    this.release_year = release_year;
    this.genre = genre;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return title;
    case 2: return release_year;
    case 3: return genre;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: title = (java.lang.String)value$; break;
    case 2: release_year = (java.lang.Integer)value$; break;
    case 3: genre = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'title' field.
   * @return The value of the 'title' field.
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Sets the value of the 'title' field.
   * @param value the value to set.
   */
  public void setTitle(java.lang.String value) {
    this.title = value;
  }

  /**
   * Gets the value of the 'release_year' field.
   * @return The value of the 'release_year' field.
   */
  public java.lang.Integer getReleaseYear() {
    return release_year;
  }

  /**
   * Sets the value of the 'release_year' field.
   * @param value the value to set.
   */
  public void setReleaseYear(java.lang.Integer value) {
    this.release_year = value;
  }

  /**
   * Gets the value of the 'genre' field.
   * @return The value of the 'genre' field.
   */
  public java.lang.String getGenre() {
    return genre;
  }

  /**
   * Sets the value of the 'genre' field.
   * @param value the value to set.
   */
  public void setGenre(java.lang.String value) {
    this.genre = value;
  }

  /**
   * Creates a new Movie RecordBuilder.
   * @return A new Movie RecordBuilder
   */
  public static io.confluent.developer.avro.Movie.Builder newBuilder() {
    return new io.confluent.developer.avro.Movie.Builder();
  }

  /**
   * Creates a new Movie RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Movie RecordBuilder
   */
  public static io.confluent.developer.avro.Movie.Builder newBuilder(io.confluent.developer.avro.Movie.Builder other) {
    return new io.confluent.developer.avro.Movie.Builder(other);
  }

  /**
   * Creates a new Movie RecordBuilder by copying an existing Movie instance.
   * @param other The existing instance to copy.
   * @return A new Movie RecordBuilder
   */
  public static io.confluent.developer.avro.Movie.Builder newBuilder(io.confluent.developer.avro.Movie other) {
    return new io.confluent.developer.avro.Movie.Builder(other);
  }

  /**
   * RecordBuilder for Movie instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Movie>
    implements org.apache.avro.data.RecordBuilder<Movie> {

    private long id;
    private java.lang.String title;
    private int release_year;
    private java.lang.String genre;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.confluent.developer.avro.Movie.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.title)) {
        this.title = data().deepCopy(fields()[1].schema(), other.title);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.release_year)) {
        this.release_year = data().deepCopy(fields()[2].schema(), other.release_year);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.genre)) {
        this.genre = data().deepCopy(fields()[3].schema(), other.genre);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Movie instance
     * @param other The existing instance to copy.
     */
    private Builder(io.confluent.developer.avro.Movie other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.title)) {
        this.title = data().deepCopy(fields()[1].schema(), other.title);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.release_year)) {
        this.release_year = data().deepCopy(fields()[2].schema(), other.release_year);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.genre)) {
        this.genre = data().deepCopy(fields()[3].schema(), other.genre);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Long getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public io.confluent.developer.avro.Movie.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public io.confluent.developer.avro.Movie.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'title' field.
      * @return The value.
      */
    public java.lang.String getTitle() {
      return title;
    }

    /**
      * Sets the value of the 'title' field.
      * @param value The value of 'title'.
      * @return This builder.
      */
    public io.confluent.developer.avro.Movie.Builder setTitle(java.lang.String value) {
      validate(fields()[1], value);
      this.title = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'title' field has been set.
      * @return True if the 'title' field has been set, false otherwise.
      */
    public boolean hasTitle() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'title' field.
      * @return This builder.
      */
    public io.confluent.developer.avro.Movie.Builder clearTitle() {
      title = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'release_year' field.
      * @return The value.
      */
    public java.lang.Integer getReleaseYear() {
      return release_year;
    }

    /**
      * Sets the value of the 'release_year' field.
      * @param value The value of 'release_year'.
      * @return This builder.
      */
    public io.confluent.developer.avro.Movie.Builder setReleaseYear(int value) {
      validate(fields()[2], value);
      this.release_year = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'release_year' field has been set.
      * @return True if the 'release_year' field has been set, false otherwise.
      */
    public boolean hasReleaseYear() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'release_year' field.
      * @return This builder.
      */
    public io.confluent.developer.avro.Movie.Builder clearReleaseYear() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'genre' field.
      * @return The value.
      */
    public java.lang.String getGenre() {
      return genre;
    }

    /**
      * Sets the value of the 'genre' field.
      * @param value The value of 'genre'.
      * @return This builder.
      */
    public io.confluent.developer.avro.Movie.Builder setGenre(java.lang.String value) {
      validate(fields()[3], value);
      this.genre = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'genre' field has been set.
      * @return True if the 'genre' field has been set, false otherwise.
      */
    public boolean hasGenre() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'genre' field.
      * @return This builder.
      */
    public io.confluent.developer.avro.Movie.Builder clearGenre() {
      genre = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Movie build() {
      try {
        Movie record = new Movie();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.title = fieldSetFlags()[1] ? this.title : (java.lang.String) defaultValue(fields()[1]);
        record.release_year = fieldSetFlags()[2] ? this.release_year : (java.lang.Integer) defaultValue(fields()[2]);
        record.genre = fieldSetFlags()[3] ? this.genre : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Movie>
    WRITER$ = (org.apache.avro.io.DatumWriter<Movie>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Movie>
    READER$ = (org.apache.avro.io.DatumReader<Movie>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
