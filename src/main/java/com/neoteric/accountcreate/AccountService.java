package com.neoteric.accountcreate;

import java.util.List;

public class AccountService {


    public static void main(String[] args) {
        Address address = new Address();
                address.setArea("Nehru Nagar");
                address.setRoadNumber("12A");
                address.setCity("Chennai");
                address.setState("Tamil Nadu");


                Nominee nominee1 = new Nominee();
                nominee1.setFirstName("Anil");
                nominee1.setLastName("Kumar");
                nominee1.setRelation("Father");
                nominee1.setPercentage("60");
                nominee1.setAddress(List.of(address));


                Nominee nominee2 = new Nominee();
                nominee2.setFirstName("Sunita");
                nominee2.setLastName("Kumar");
                nominee2.setRelation("Mother");
                nominee2.setPercentage("40");
                nominee2.setAddress(List.of(address));


                Account account = new Account();
                account.setAccountNumber("ACC1001");
                account.setAge(30);
                account.setAddharNumber("123456789012");
                account.setPanNumber("ABCDE1234F");
                account.setDateofBirth("1995-06-25");
                account.setAddress(List.of(address));
                account.setNomainee(List.of(nominee1, nominee2));


                validateAadhaar(account.getAddharNumber());
                validateNomineePercentage(account);
            }


            public static void validateAadhaar(String aadhar) {
                if (aadhar != null && aadhar.length() == 12 && aadhar.matches("[0-9]+")) {
                    System.out.println(" Aadhaar is valid.");
                } else {
                    System.out.println("Invalid Aadhaar. It must be 12 digits.");
                }
            }


            public static void validateNomineePercentage(Account account) {
                int total = 0;

                for (Nominee nominee : account.getNomainee()) {
                    try {
                        total += Integer.parseInt(nominee.getPercentage());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid percentage format for nominee: " + nominee.getFirstName());
                        return;
                    }
                }

                if (total == 100) {
                    System.out.println("Total nominee percentage is 100%.");
                } else {
                    System.out.println(" Total nominee percentage is not 100%. It is: " + total + "%");
                }
            }
        }




