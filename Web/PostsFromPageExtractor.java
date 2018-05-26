import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

public class PostsFromPageExtractor {

/**
 * A simple Facebook4J client which
 * illustrates how to access group feeds / posts / comments.
 * 
 * @param args
 * @throws FacebookException 
 */
public static void main(String[] args) throws FacebookException {

    // Generate facebook instance.
    Facebook facebook = new FacebookFactory().getInstance();
    // Use default values for oauth app id.
    facebook.setOAuthAppId("458541621267633","f350455eeaed248a3b2704e98b10ca71");
    // Get an access token from: 
    // https://developers.facebook.com/tools/explorer
    // Copy and paste it below.
    String accessTokenString = "EAAGhCopzTLEBAJpwpJIho4meYaMumvHMyBo7Uxaxq2ZBDO99Gjh9yb1hLsDVRhN8g3wLFuy48HmvDiyaWaK7Y2uCFQjjlgZB8mFSyyQuGmjqZAbaMZAXRr4PoZCLkLYPzsHggM2hpd3BhiY5xjx12H7fN18dGZCtoefBr3JE6CSIbBm7UGNrZCiOyMha2F4fNtf7UEX0jV4y60RFFO5Xpqg";
    AccessToken at = new AccessToken(accessTokenString);
    // Set access token.
    facebook.setOAuthAccessToken(at);

    // We're done.
    // Access group feeds.
    // You can get the group ID from:
    // https://developers.facebook.com/tools/explorer

    // Set limit to 25 feeds.
    facebook.postStatusMessage("Hello World from Facebook4J.");
    }
}