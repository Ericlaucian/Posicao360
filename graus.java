    package frc.robot;

    public class JoystickPosition {
            public static double Quadrante (double lefty, double leftx){
                
                if(Math.abs(lefty) > 0.05 || Math.abs(leftx) > 0.05){
                    if (lefty < 0 && leftx >= 0){
                        return 1;
                    }else if (lefty >= 0 && leftx > 0){
                        return 2;
                    }else if (lefty > 0 && leftx <= 0){
                        return 3;
                    }else if (lefty <= 0 && leftx < 0){
                        return 4;
                    }else{return 0;}}

                else{
                    return 0;
                }
            
        }
        

        public static double PositiveGraus(double lefty, double leftx, double quadrante){
            double graus;
            double absY = Math.abs(lefty);
            double absX = Math.abs(leftx);

            if(quadrante == 1){
                if (absY > absX) { graus = ((absX/absY)*45); } // FOI
                else{ graus = (90 - (absY/absX)*45);} //FOI
                return graus;
            } 
            else if(quadrante == 2){
                if (absY > absX) { graus = ((absX/absY)*45);} // FOI
                else{ graus = (90 - (absY/absX)*45);} // FOI
                return 180 - graus;
            } 
            else if(quadrante == 3){
                if (absY > absX) { graus = (180 + (absX/absY)*45);} // 
                else{ graus = (270 - (absY/absX)*45);}
                return graus;
            }
            else if(quadrante == 4){
                if (absY > absX) { graus = (360 - (absX/absY)*45);} // 
                else{ graus = (270 + (absY/absX)*45);}
                return graus;
            }
            else if(lefty < 0 && Math.abs(leftx) == 0){
                graus = 0;
                return graus;

            }
            else if(lefty > 0 && Math.abs(leftx) == 0){
                graus = 180;
                return graus;
            }
            else if(leftx < 0 && Math.abs(lefty) == 0){
                graus = 270;
                return graus;
            }
            else if(leftx > 0 && Math.abs(lefty) == 0){
                graus = 90;
                return graus;
            }
            else{return 0;} 
        }

        public static double LastQuadrante(double quadrante, double[] fila, double soma){
            if(fila[1] != quadrante){
                fila[0] = fila[1];
                fila[1] = quadrante;
            }
            return soma;
        }
        
    }
