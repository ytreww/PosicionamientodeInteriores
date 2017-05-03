package com.example.soportecea.posicionamientodeinteriores;

/**
 * Created by Ismael Ochoa on 03/05/2017.
 */

public class Arbol {
    private String lab = "";
    private double norm;

    public void Arbol() {
    }

    public String comparar(double x, double y, double z) {
        norm = Math.sqrt((Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)));

        if (y <= 48.3978) {
            if (z <= 5.6564) {
                if (x <= 49.1928) {
                    if (y <= 33.3601) {
                        lab = "C";
                    }// if 4
                    if (y > 33.3601) {
                        lab = "E";
                    }// if 4
                }// if 3
                if (x > 49.1928) {
                    if (z <= 2.6611) {
                        if (x <= 67.0639) {
                            if (x <= 62.8173) {
                                if (z <= 1.8295) {
                                    if (norm <= 62.15358) {
                                        lab = "D";
                                    }//if 8
                                    if (norm > 62.15358) {
                                        if (norm <= 73.78022) {
                                            if (x <= 57.3318) {
                                                if (z <= 0.4989) {
                                                    if (x <= 56.6238) {
                                                        lab = "E";
                                                    }// if 12
                                                    if (x > 56.6238) {
                                                        if (z <= -2.3284) {
                                                            if (z <= -5.4901) {
                                                                lab = "A";
                                                            }//if 14
                                                            if (z > -5.4901) {
                                                                lab = "D";
                                                            }// if 14
                                                        }//if 13
                                                        if (z > -2.3284) {
                                                            if (norm <= 64.931274) {
                                                                lab = "E";
                                                            }//if 14
                                                            if (norm > 64.931274) {
                                                                lab = "C";
                                                            }//if14
                                                        }//if 13
                                                    }// if 12
                                                }// if 11
                                                if (z > 0.4989) {
                                                    lab = "D";
                                                }//if 11
                                            } // if10
                                            if (x > 57.3318) {
                                                if (z <= -0.3326) {
                                                    if (z <= -5.8227) {
                                                        if (y <= 39.2364) {
                                                            lab = "E";
                                                        }// if 13
                                                        if (y > 39.2364) {
                                                            lab = "D";
                                                        }// if 13
                                                    }//if 12
                                                    if (z > -5.8227) {
                                                        lab = "D";
                                                    }// 12
                                                }//if 11
                                                if (z > -0.3326) {
                                                    lab = "E";
                                                }//if 11
                                            }// if 10
                                        }// if9
                                        if (norm > 73.78022) {
                                            lab = "D";
                                        }//if9
                                    }//if 8
                                }//if 7
                                if (z > 1.8295) {
                                    if (x <= 57.8628) {
                                        if (x <= 52.2003) {
                                            lab = "E";
                                        }// if9
                                        if (x > 52.2003) {
                                            if (y <= 40.6188) {
                                                lab = "D";
                                            }//if10
                                            if (y > 40.6188) {
                                                lab = "C";
                                            }//if10
                                        }//if9
                                    }//if 8
                                    if (x > 57.8628) {
                                        if (norm <= 71.429344) {
                                            if (z <= 2.4948) {
                                                if (norm <= 69.66306) {
                                                    if (z <= 2.1621) {
                                                        if (x <= 59.1018) {
                                                            lab = "E";
                                                        }//if13
                                                        if (x > 59.1018) {
                                                            lab = "D";
                                                        }//if13
                                                    }//if 12
                                                    if (z > 2.1621) {
                                                        lab = "E";
                                                    }//if 12
                                                }//if11
                                                if (norm > 69.66306) {
                                                    lab = "E";
                                                }
                                            }//if10
                                            if (z > 2.4948) {
                                                lab = "D";
                                            }//if10
                                        }//if9
                                        if (norm > 71.429344) {
                                            lab = "D";
                                        }//if9

                                    }//if 8
                                }//if 7
                            } // if 6
                            if (x > 62.8173) {
                                lab = "D";
                            }//if6
                        }// if 5
                        if (x > 67.0639) {
                            lab = "C";
                        }//if5
                    }//if 4
                    if (z > 2.6611) {
                        if (norm <= 68.97502) {
                            if (z <= 3.6605) {
                                if (x <= 59.1018) {
                                    if (x <= 55.0323) {
                                        lab = "C";
                                    }//if8
                                    if (x > 55.0323) {
                                        lab = "D";
                                    }//if8
                                }//if 7
                                if (x > 59.1018) {
                                    lab = "C";
                                }
                            }//if6
                            if (z > 3.6605) {
                                lab = "C";
                            }//if6
                        }//if5
                        if (norm > 68.97502) {
                            if (norm <= 80.6211) {
                                if (y <= 30.9401) {
                                    if (z <= 4.4921) {
                                        if (norm <= 70.19303) {
                                            if (x <= 63.3483) {
                                                lab = "C";
                                            }//if10
                                            if (x > 63.3483) {
                                                lab = "D";
                                            }//if10
                                        }//if9
                                        if (norm > 70.19303) {
                                            lab = "E";
                                        }//if9
                                    }//if8
                                    if (z > 4.4921) {
                                        if (z <= 4.8248) {
                                            lab = "D";
                                        }//if9
                                        if (z > 4.8248) {
                                            if (y <= 29.7302) {
                                                if (y <= 28.1738) {
                                                    if (y <= 25.2349) {
                                                        lab = "D";
                                                    }//if12
                                                    if (y > 25.2349) {
                                                        lab = "C";
                                                    }//if12
                                                }//if11
                                                if (y > 28.1738) {
                                                    if (norm <= 71.2174) {
                                                        lab = "C";
                                                    }//if12
                                                    if (norm > 71.2174) {
                                                        lab = "E";
                                                    }//if12
                                                }//if11
                                            }//10
                                            if (y > 29.7302) {
                                                lab = "D";
                                            }//10
                                        }//if9
                                    }//if8
                                }//if7
                                if (y > 30.9401) {
                                    lab = "D";
                                }//if7
                            }//if6
                            if (norm > 80.6211) {
                                lab = "C";
                            }
                        }//if5
                    }//if4
                }// if 3
            }// if 2
            if (z > 5.6564) {
                if (z <= 9.3185) {
                    if (norm <= 68.89087) {
                        if (x <= 62.1093) {
                            lab = "C";
                        }
                        if (x > 62.1093) {
                            lab = "D";
                        }
                    }
                    if (norm > 68.89087) {
                        if (z <= 6.4895) {
                            if (norm <= 70.70305) {
                                if (z <= 5.9906) {
                                    lab = "C";
                                }//if7
                                if (z > 5.9906) {
                                    if (z <= 6.1574) {
                                        if (norm <= 70.00978) {
                                            lab = "D";
                                        }//if9
                                        if (norm > 70.00978) {
                                            lab = "C";
                                        }//if9
                                    }//if8
                                    if (z > 6.1574) {
                                        if (x <= 58.5708) {
                                            lab = "D";
                                        }
                                        if (x > 58.5708) {
                                            if (y <= 30.2474) {
                                                lab = "D";
                                            }
                                            if (y > 30.2474) {
                                                lab = "C";
                                            }
                                        }
                                    }//if8
                                }//if7
                            }//if6
                            if (norm > 70.70305) {
                                if (x <= 65.2954) {
                                    lab = "D";
                                }
                                if (x > 65.2954) {
                                    if (y <= 29.039) {
                                        lab = "C";
                                    }
                                    if (y > 29.039) {
                                        if (norm <= 74.92317) {
                                            lab = "D";
                                        }
                                        if (norm > 74.92317) {
                                            if (z <= 6.1574) {
                                                lab = "C";
                                            }
                                            if (z > 6.1574) {
                                                lab = "D";
                                            }
                                        }
                                    }
                                }
                            }
                        }//if5
                        if (z > 6.4895) {
                            if (x <= 63.1713) {
                                lab = "C";
                            }
                            if (x > 63.1713) {
                                if (norm <= 78.94109) {
                                    if (y <= 34.5687) {
                                        if (z <= 7.155) {
                                            lab = "D";
                                        }
                                        if (z > 7.155) {
                                            if (x <= 65.2954) {
                                                if (y <= 30.2474) {
                                                    lab = "D";
                                                }
                                                if (y > 30.2474) {
                                                    lab = "C";
                                                }
                                            }
                                            if (x > 65.2954) {
                                                lab = "D";
                                            }
                                        }
                                    }
                                    if (y > 34.5687) {
                                        if (z <= 7.9864) {
                                            if (z <= 7.3211) {
                                                lab = "C";
                                            }
                                            if (z > 7.3211) {
                                                lab = "D";
                                            }
                                        }
                                        if (z > 7.9864) {
                                            lab = "C";
                                        }
                                    }
                                }
                                if (norm > 78.94109) {
                                    lab = "C";
                                }
                            }
                        }
                    }//if4
                }//if3
                if (z > 9.3185) {
                    lab = "C";
                }
            }//if2
        }// if 1
        if (y > 48.3978) {
            if (x <= 16.4566) {
                if (x <= 9.555) {
                    lab = "B";
                }
                if (x > 9.555) {
                    if (y <= 60.8428) {
                        lab = "E";
                    }
                    if (y > 60.8428) {
                        lab = "B";
                    }
                }
            }
            if (x > 16.4566) {
                if (z <= -3.4942) {
                    if (y <= 66.0278) {
                        if (x <= 22.8256) {
                            if (y <= 56.694) {
                                lab = "E";
                            }
                            if (y > 56.694) {
                                lab = "B";
                            }
                        }
                        if (x > 22.8256) {
                            if (z <= -8.319) {
                                if (x <= 42.6452) {
                                    lab = "E";
                                }
                                if (x > 42.6452) {
                                    if (y <= 50.4714) {
                                        lab = "C";
                                    }
                                    if (y > 50.4714) {
                                        lab = "E";
                                    }
                                }
                            }
                            if (z > -8.319) {
                                if (norm <= 65.504524) {
                                    lab = "E";
                                }
                                if (norm > 65.504524) {
                                    lab = "A";
                                }
                            }
                        }
                    }
                    if (y > 66.0278) {
                        if (x <= 30.2581) {
                            lab = "B";
                        }
                        if (x > 30.2581) {
                            if (z <= -17.3049) {
                                lab = "E";
                            }
                            if (z > -17.3049) {
                                lab = "A";
                            }
                        }
                    }
                }
                if (z > -3.4942) {
                    lab = "A";
                }
            }
        }
        return lab;

    }
}