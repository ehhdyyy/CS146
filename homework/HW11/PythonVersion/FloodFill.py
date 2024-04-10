class colorFlood:
    def floodFill(self, image, sr, sc, color):
        if(image[sr][sc] == color):
            return image
        self.fill(self,image,sr,sc,image[sr][sc], color)
        return image

    def fill(self, image, sr, sc, color, initialColor):
        if(sr < 0 or sc < 0 or sr >= len(image) or sc >= len(image[0]) or image[sr][sc] != color):
            return
        image[sr][sc] = initialColor

        self.fill(self,image, sr-1, sc, color, initialColor)
        self.fill(self,image, sr+1, sc, color, initialColor)
        self.fill(self,image, sr, sc-1, color, initialColor)
        self.fill(self,image, sr, sc+1, color, initialColor)


x = colorFlood
test = [[1,1,1], [1,1,0], [1,0,1]]
test1 = [[0,0,0],[0,0,0]]

print("Test Case 1:")
print("Initial: ")
for i in range(len(test)):
    for j in range(len(test[0])):
        print("[" + str(test[i][j]) + "] ", end= "")
    print()

result = x.floodFill(x,test,1,1,2)

print("\nAfter Flood Fill:")
for i in range(len(test)):
    for j in range(len(test[0])):
        print("[" + str(result[i][j]) + "] ", end= "")
    print()

print("\nTest Case 2:")
print("Initial: ")

for i in range(len(test1)):
    for j in range(len(test1[0])):
        print("[" + str(test1[i][j]) + "] ", end= "")
    print()
result = x.floodFill(x,test1,0,0,0)

print("\nAfter Flood Fill:")
for i in range(len(test1)):
    for j in range(len(test1[0])):
        print("[" + str(result[i][j]) + "] ", end= "")
    print()


