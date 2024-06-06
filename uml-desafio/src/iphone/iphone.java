package iphone;

import papeis.AparelhoTelefonico.ligacao;

import papeis.NavegarNaInternet.internet;

import papeis.ReprodutorMusical.player;;



public class iphone implements ligacao, internet, player{
        public static void main(String[] args) {
        }

        @Override
        public void Player() {
                System.out.println("Player");
        }

        @Override
        public void Navagecao() {
                System.out.println("Navegando na Internet");
        }

        @Override
        public void Telefone() {
                System.out.println("Ligação");
        }
    
}