package dominio;


public class Person {
  private String name;
  private int age;
  private String gender;
    

    public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }


  

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

   
    public void setAge(int age) {
        this.age = age;
    }

  
    public String getGender() {
        return gender;
    }

   
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
      return " ------------------PESSOA ------------------\n"+
      "Name:" +name+ "\nAge: "+age+
      "\nGender: "+gender+
      "\n------------------------ ------------------";
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + age;
      result = prime * result + ((gender == null) ? 0 : gender.hashCode());
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
      Person other = (Person) obj;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      if (age != other.age)
        return false;
      if (gender == null) {
        if (other.gender != null)
          return false;
      } else if (!gender.equals(other.gender))
        return false;
      return true;
    }

}