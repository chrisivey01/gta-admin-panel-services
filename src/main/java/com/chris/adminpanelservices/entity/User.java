package com.chris.adminpanelservices.entity;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String identifier;
    String license;
    int money;
    String name;
    String skin;
    String job;

    @Column(name = "job_grade")
    int jobGrade;
    String loadout;
    String position;
    int bank;
    @Column(name = "permission_level")
    int permissionLevel;
    String group;
    String firstname;
    String lastname;
    String dateofbirth;
    String sex;
    String height;
    int is_dead;
    @Column(name = "last_property")
    String lastProperty;
    @Column(name = "phone_number")
    String phoneNumber;
    int jail;
    String status;

    public User(){}

    public User(String identifier, String license, int money, String name, String skin, String job, int jobGrade, String loadout, String position, int bank, int permissionLevel, String group, String firstname, String lastname, String dateofbirth, String sex, String height, int is_dead, String lastProperty, String phoneNumber, int jail, String status) {
        this.identifier = identifier;
        this.license = license;
        this.money = money;
        this.name = name;
        this.skin = skin;
        this.job = job;
        this.jobGrade = jobGrade;
        this.loadout = loadout;
        this.position = position;
        this.bank = bank;
        this.permissionLevel = permissionLevel;
        this.group = group;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
        this.sex = sex;
        this.height = height;
        this.is_dead = is_dead;
        this.lastProperty = lastProperty;
        this.phoneNumber = phoneNumber;
        this.jail = jail;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(int jobGrade) {
        this.jobGrade = jobGrade;
    }

    public String getLoadout() {
        return loadout;
    }

    public void setLoadout(String loadout) {
        this.loadout = loadout;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public int getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(int permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getIs_dead() {
        return is_dead;
    }

    public void setIs_dead(int is_dead) {
        this.is_dead = is_dead;
    }

    public String getLastProperty() {
        return lastProperty;
    }

    public void setLastProperty(String lastProperty) {
        this.lastProperty = lastProperty;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getJail() {
        return jail;
    }

    public void setJail(int jail) {
        this.jail = jail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
