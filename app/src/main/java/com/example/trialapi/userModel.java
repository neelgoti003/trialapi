package com.example.trialapi;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




public class userModel implements Serializable{
  /*  public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }*/
/*
    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getFirstappearance() {
        return firstappearance;
    }

    public void setFirstappearance(String firstappearance) {
        this.firstappearance = firstappearance;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String name;
    public String realname;
    public String team;
    public String firstappearance;
    public String createdby;
    public String publisher;
    public String imageurl;
    public String bio;*/
    @SerializedName("word")
    private String word;
    @SerializedName("phonetic")
    private String phonetic;
    @SerializedName("phonetic")
    private ArrayList<Phonetic> phonetics;
    @SerializedName("Meaning")
    private ArrayList<Meaning> meanings;
    @SerializedName("license")
    private License license;
    @SerializedName("sourceUrls")
    private ArrayList<String> sourceUrls;

    // Getters and setters
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public ArrayList<Phonetic> getPhonetics() {
        return phonetics;
    }

    public void setPhonetics(ArrayList<Phonetic> phonetics) {
        this.phonetics = phonetics;
    }

    public List<Meaning> getMeanings() {
        return meanings;
    }

    public void setMeanings(ArrayList<Meaning> meanings) {
        this.meanings = meanings;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public List<String> getSourceUrls() {
        return sourceUrls;
    }

    public void setSourceUrls(ArrayList<String> sourceUrls) {
        this.sourceUrls = sourceUrls;
    }

    public static class Phonetic implements Serializable {

        @SerializedName("text")
        private String text;
        @SerializedName("audio")
        private String audio;
        @SerializedName("sourceUrl")
        private String sourceUrl;
        @SerializedName("license")
        private License license;


        // Getters and setters
        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getAudio() {
            return audio;
        }

        public void setAudio(String audio) {
            this.audio = audio;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

        public License getLicense() {
            return license;
        }

        public void setLicense(License license) {
            this.license = license;
        }
    }

    public static class Meaning implements Serializable {
        @SerializedName("partOfSpeech")
        private String partOfSpeech;
        @SerializedName("definitions")
        private ArrayList<Definition> definitions;
        @SerializedName("synonyms")
        private ArrayList<String> synonyms;
        @SerializedName("antonyms")
        private ArrayList<String> antonyms;


        // Getters and setters
        public String getPartOfSpeech() {
            return partOfSpeech;
        }

        public void setPartOfSpeech(String partOfSpeech) {
            this.partOfSpeech = partOfSpeech;
        }

        public ArrayList<Definition> getDefinitions() {
            return definitions;
        }

        public void setDefinitions(ArrayList<Definition> definitions) {
            this.definitions = definitions;
        }

        public ArrayList<String> getSynonyms() {
            return synonyms;
        }

        public void setSynonyms(ArrayList<String> synonyms) {
            this.synonyms = synonyms;
        }

        public ArrayList<String> getAntonyms() {
            return antonyms;
        }

        public void setAntonyms(ArrayList<String> antonyms) {
            this.antonyms = antonyms;
        }
    }

    public static class Definition implements Serializable{
        @SerializedName("definition")
        private String definition;
        @SerializedName("synonyms")
        private ArrayList<String> synonyms;
        @SerializedName("antonyms")
        private ArrayList<String> antonyms;
        @SerializedName("example")
        private String example;

        // Getters and setters
        public String getDefinition() {
            return definition;
        }

        public void setDefinition(String definition) {
            this.definition = definition;
        }

        public ArrayList<String> getSynonyms() {
            return synonyms;
        }

        public void setSynonyms(ArrayList<String> synonyms) {
            this.synonyms = synonyms;
        }

        public ArrayList<String> getAntonyms() {
            return antonyms;
        }

        public void setAntonyms(ArrayList<String> antonyms) {
            this.antonyms = antonyms;
        }

        public String getExample() {
            return example;
        }

        public void setExample(String example) {
            this.example = example;
        }
    }

    public static class License implements Serializable{
        @SerializedName("name")
        private String name;
        @SerializedName("url")
        private String url;

        // Getters and setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}






