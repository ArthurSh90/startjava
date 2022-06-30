class Wolf {
    private String gender;
    private String nickname;
    private float weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("incorrect age \n");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println(nickname + " walks");
    }

    public void sit() {
        System.out.println(nickname + " sitting");
    }

    public void run() {
        System.out.println(nickname + " runs");
    }

    public void howl() {
        System.out.println(nickname + " howls");
    }

    public void hunting() {
        System.out.println(nickname + " hunts");
    }
}