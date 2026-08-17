public class Item {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Integer id;  
    private LocalDateTime createdAt;  
    @ManyToOne  
    @JoinColumn(name = "person_id")  
    private Person person;  
    private String name;  
    private LocalDateTime deletedAt;  
    private Boolean done;  
    private String description;  
      
      
  
}