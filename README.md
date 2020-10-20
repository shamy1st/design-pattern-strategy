# Java Implementation of Strategy Design Pattern

**Strategy** design pattern enables selecting an algorithm at runtime. ([wiki](https://en.wikipedia.org/wiki/Strategy_pattern))

![](https://github.com/shamy1st/design-pattern-strategy-java/blob/main/strategy-uml.png)
### Problem: 
You have **ImageStorage** class which compress and apply filter on image before store it.

**Two Issues:**
1. ImageStorage class violate "single responsibility principle".
2. Difficult to add new compressor or new filter.
---

    public class ImageStorage {
        private String compressor;
        private String filter;

        public ImageStorage(String compressor, String filter) {
            this.compressor = compressor;
            this.filter = filter;
        }

        public void store(String fileName, Compressor compressor, Filter filter) {
            if(this.compressor == "jpeg") {
                System.out.println("Compressing using jpeg");
            } else if(this.compressor == "png") {
                System.out.println("Compressing using png");
            }

            if(this.filter == "Black and White") {
                System.out.println("Applying Black and White filter");
            } else if(this.filter == "High Contrast") {
                System.out.println("Applying High Contrast filter");
            }
        }
    }    
### Solution:
![](https://github.com/shamy1st/design-pattern-strategy-java/blob/main/strategy-solution-uml-2.png)
![](https://github.com/shamy1st/design-pattern-strategy-java/blob/main/strategy-solution-uml-3.png)
