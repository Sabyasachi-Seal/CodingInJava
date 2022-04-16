if(numbers.get(k)>9){
                int temp = numbers.get(k);
                numbers.set(k, temp%10);
                numbers.set(k+1, temp/10);
                number %= (int)(Math.pow(10, num.length-k));
                k+=2;
                continue;
            }