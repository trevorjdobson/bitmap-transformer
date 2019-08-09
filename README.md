# bitmap-transformer
Java 401 Bitmap Transformer

[Link to Code](https://github.com/trevorjdobson/bitmap-transformer/blob/master/src/main/java/bitmap/transformer/App.java)

[Link to Tests](https://github.com/trevorjdobson/bitmap-transformer/blob/master/src/test/java/bitmap/transformer/BitmapTransformerTest.java)

## How To Use This App
* First clone this repo to your local machine
* cd into bitmap-transformer/src/main/java/bitmap/transformer
* run App.java ./src/main/resources/images/coffee.bmp ./src/main/resources/images/YourNewFileNameForGrey.bmp transform-grey
* run App.java ./src/main/resources/images/coffee.bmp ./src/main/resources/images/YourNewFileNameForResize.bmp resize
* run App.java ./src/main/resources/images/coffee.bmp ./src/main/resources/images/YourNewFileNameForFlip.bmp transform-flip
* After running each of those commands you should see new images in your resources/images directory with the new filename

## How to Test
* cd into bitmap-transformer
* run ./gradlew test

## Resources
* https://memorynotfound.com/java-resize-image-fixed-width-height-example/
* https://stackoverflow.com/questions/25761438/understanding-bufferedimage-getrgb-output-values
* https://www.mkyong.com/java/how-to-convert-bufferedimage-to-byte-in-java/
* https://stackoverflow.com/questions/6524196/java-get-pixel-array-from-image
* https://stackoverflow.com/questions/11951646/setrgb-in-java
* https://stackoverflow.com/questions/21920939/reverse-the-rows-of-a-2d-array

## Collaborators
* Manish KC
* Trevor Dobson
