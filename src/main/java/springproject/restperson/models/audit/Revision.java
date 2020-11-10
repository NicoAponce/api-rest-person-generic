package springproject.restperson.models.audit;import lombok.Data;import org.hibernate.envers.RevisionEntity;import org.hibernate.envers.RevisionNumber;import org.hibernate.envers.RevisionTimestamp;import springproject.restperson.configurations.CustomerRevisionListener;import javax.persistence.*;import java.io.Serializable;import java.util.Date;@Entity@Table(name = "reviews")@RevisionEntity(CustomerRevisionListener.class)@Datapublic class Revision implements Serializable {    private static final long serialVersionUID = 1L;    @Id    @GeneratedValue(strategy = GenerationType.SEQUENCE,            generator = "revision_seq")    @SequenceGenerator(name = "revision_seq",            sequenceName = "rbac.seq_revision_id")    @RevisionNumber    private int id;    @Temporal(TemporalType.TIMESTAMP)    @RevisionTimestamp    private Date date;}